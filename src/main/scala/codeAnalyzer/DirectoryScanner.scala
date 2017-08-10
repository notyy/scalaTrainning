package codeAnalyzer
import java.io.File

trait DirectoryScanner {

  def withFile[T](path: String)(f: File => T)(reduceF: (T, T) => T): T = {
    val file = new File(path)
    if (file.isFile) f(file)
    else {
      val files = file.listFiles()
      files.map(subFile => withFile(subFile.getAbsolutePath)(f)(reduceF)).reduce(reduceF)
    }
  }
}

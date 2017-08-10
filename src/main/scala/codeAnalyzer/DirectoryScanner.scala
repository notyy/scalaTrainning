package codeAnalyzer
import java.io.File

trait DirectoryScanner {

  def withFile[T](path: String)(f: File => Option[T])(reduceF: (T, T) => T): Option[T] = {
    val file = new File(path)
    if (file.isFile) f(file)
    else {
      val files = file.listFiles()
      if(files.nonEmpty) {
        Some(files.toList.flatMap(subFile => withFile(subFile.getAbsolutePath)(f)(reduceF)).reduce(reduceF))
      }else{
        None
      }
    }
  }
}

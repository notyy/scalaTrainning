package codeAnalyzer


trait CodeAnalyzer {
  this: DirectoryScanner with FileProcessor =>

  def analyze(path: String): Option[CodeInfo] = {
    withFile(path)(processFile)(_ + _)
  }
}

object CodeAnalyzer extends CodeAnalyzer with DirectoryScanner with FileProcessor
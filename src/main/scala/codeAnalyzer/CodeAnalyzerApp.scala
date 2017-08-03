package codeAnalyzer

object CodeAnalyzerApp extends App {
  val path = args(0)
  val fileCount = CodeAnalyzer.fileCount(path)
  println(s"there are $fileCount files under $path")
}

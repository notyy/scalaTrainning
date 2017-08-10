package codeAnalyzer

object CodeAnalyzerApp extends App {
  val path = args(0)
  val codeInfo = CodeAnalyzer.analyze(path)
  val fileCount = codeInfo.fileCount
  println(s"there are $fileCount files under $path")
}

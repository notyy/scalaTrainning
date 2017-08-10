package codeAnalyzer

object CodeAnalyzerApp extends App {
  val path = args(0)
  val codeInfo = CodeAnalyzer.analyze(path)
  if(codeInfo.isDefined){
    val fileCount = codeInfo.get.fileCount
    println(s"there are $fileCount files under $path")
  }else{
    println(s"no file found under $path")
  }
}

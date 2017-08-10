package codeAnalyzer

case class CodeInfo(fileCount: Int, lineOfCode: Int){
  def +(other: CodeInfo): CodeInfo = CodeInfo(fileCount + other.fileCount, lineOfCode + other.lineOfCode)
}

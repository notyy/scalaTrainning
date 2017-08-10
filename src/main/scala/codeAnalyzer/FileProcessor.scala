package codeAnalyzer
import java.io.File

import scala.io.Source

trait FileProcessor {

  def processFile(file: File): Option[CodeInfo] = {
    Some(CodeInfo(1, Source.fromFile(file).getLines().length))
  }
}

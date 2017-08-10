package codeAnalyzer

import java.io.File

import scala.io.Source


trait CodeAnalyzer {
  this: DirectoryScanner =>

  def processFile(file: File):CodeInfo = {
    CodeInfo(1, Source.fromFile(file).getLines().length)
  }

  def analyze(path: String): CodeInfo = {
    withFile(path)(processFile)(_ + _)
  }
}

object CodeAnalyzer extends CodeAnalyzer with DirectoryScanner
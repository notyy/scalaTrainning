package codeAnalyzer

import java.io.File

import scala.io.Source


trait CodeAnalyzer {
  this: DirectoryScanner =>

  def fileCount(path: String): Int = {
    withFile(path)(_ => 1)(_ + _)
  }

  def lineOfCode(path: String): Int = {
    withFile(path)(file => Source.fromFile(file).getLines().length)(_ + _)
  }

  def processFile(file: File):CodeInfo = {
    CodeInfo(1, Source.fromFile(file).getLines().length)
  }

  def analyze(path: String): CodeInfo = {
    withFile(path)(processFile)(_ + _)
  }
}

object CodeAnalyzer extends CodeAnalyzer with DirectoryScanner {

}

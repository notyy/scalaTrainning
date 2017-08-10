package codeAnalyzer

import scala.io.Source


trait CodeAnalyzer {
  this: DirectoryScanner =>

  def fileCount(path: String): Int = {
    withFile(path)(_ => 1)(_ + _)
  }

  def lineOfCode(path: String): Int = {
    withFile(path)(file => Source.fromFile(file).getLines().length)(_ + _)
  }
}

object CodeAnalyzer extends CodeAnalyzer with DirectoryScanner

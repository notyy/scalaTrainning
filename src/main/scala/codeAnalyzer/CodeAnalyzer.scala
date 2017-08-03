package codeAnalyzer

import java.io.File

import scala.io.Source


trait CodeAnalyzer {
  def fileCount(path: String): Int = {
    val file = new File(path)
    if (file.isFile) 1
    else {
      val files = file.listFiles()
      files.map(f => fileCount(f.getAbsolutePath)).sum
    }
  }
}

object CodeAnalyzer extends CodeAnalyzer {
  def lineOfCode(path: String): Int = {
    val file = new File(path)
    if (file.isFile) Source.fromFile(path).getLines().length
    else {
      val files = file.listFiles()
      files.map(f => lineOfCode(f.getAbsolutePath)).sum
    }
  }
}

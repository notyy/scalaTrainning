package codeAnalyzer

import java.io.File


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

object CodeAnalyzer extends CodeAnalyzer

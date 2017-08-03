package codeAnalyzer

import org.scalatest.{FunSpec, Matchers}

class CodeAnalyzerTest extends FunSpec with Matchers {
  describe("CodeAnalyzer"){
    it("can scan directory"){
      CodeAnalyzer.fileCount("fixture")  shouldBe 2
    }
  }
}

package codeAnalyzer

import java.io.File

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class CodeAnalyzerSpec extends FeatureSpec with Matchers with GivenWhenThen {
  feature("scan a folder and tell file count"){
    info("As a developers")
    info("I want to analyze my source code base")
    info("So that I can find where to improve")

    scenario("analyze folder and get code info"){
      Given("a folder contains 3 files, have line of code, 5, 10, 15")
      When("I analyze the fold")
      val codeInfo: CodeInfo = CodeAnalyzer.analyze("fixture")
      Then("it should report 3 files and 30 lines")
      codeInfo.fileCount shouldBe 3
      codeInfo.lineOfCode shouldBe 30
    }
    scenario("should report error if folder not exist"){
      pending
    }
  }
}

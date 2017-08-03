package codeAnalyzer

import org.scalatest.{FeatureSpec, GivenWhenThen, Matchers}

class CodeAnalyzerSpec extends FeatureSpec with Matchers with GivenWhenThen {
  feature("scan a folder and tell file count"){
    info("As a developers")
    info("I want to analyze my source code base")
    info("So that I can find where to improve")

    scenario("scan a folder recursively and get file count"){
      Given("a folder contains 2 files and 1 sub folder contains 1 file")
      When("I scan the folder")
      val fileCount = CodeAnalyzer.fileCount("fixture")
      Then("it should report 3 files")
      fileCount shouldBe 3
    }
    scenario("calc total line of code"){
      Given("a folder contains 3 files, have line of code, 5, 10, 15")
      When("I calc total line of code")
      val lineOfCode = CodeAnalyzer.lineOfCode("fixture")
      Then("it should report 30 files")
      lineOfCode shouldBe 30
    }
    scenario("should report error if folder not exist"){
      pending
    }
  }
}

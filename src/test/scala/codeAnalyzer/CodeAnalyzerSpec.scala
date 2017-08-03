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
    scenario("should report error if folder not exist"){
      pending
    }
  }
}

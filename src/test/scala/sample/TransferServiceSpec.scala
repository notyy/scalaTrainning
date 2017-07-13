package sample

import org.scalatest.{FunSpec, Matchers}

class TransferServiceSpec extends FunSpec with Matchers {
  describe("TransferService"){
    it("can transfer money from source account to target account"){
      val srcAccount = new Account("xx",100.0)
      val targetAccount = new Account("yy", 50.0)
      TransferService.transfer(srcAccount, targetAccount, 50.0)
      srcAccount.balance shouldBe 50.0
      targetAccount.balance shouldBe 100.0
    }
    it("transfer should fail if not enough balance in source account"){
      pending
    }
  }
}

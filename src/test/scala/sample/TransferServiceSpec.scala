package sample

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{FunSpec, GivenWhenThen, Matchers}

class TransferServiceSpec extends FunSpec with Matchers with TableDrivenPropertyChecks with GivenWhenThen {
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
    //this is a scalatest table-driven-property-check example
    it("can transfer any amount of money"){
      val example =
        Table(
          ("source account balance","target account balance","transfer amount"," expected source account balance","expected target account balance"),
          (100, 50, 50, 50, 100),
          (77, 0, 50, 27, 50)
        )
      forAll(example){ (srcBalance, targetBalance, amount, expSrcBalance,expTargetBalance) =>
        Given(s"source account who's owner is xx,have balance: $srcBalance")
        val srcAccount = new Account("xx", srcBalance)
        And(s"target account who's owner is yy, have balance: $targetBalance")
        val targetAccount = new Account("yy", targetBalance)
        When(s"Transfer $amount from srcAccount to targetAccount")
        TransferService.transfer(srcAccount, targetAccount, amount)
        Then(s"srcAccount should have balance $expSrcBalance")
        srcAccount.balance shouldBe expSrcBalance
        And(s"targetAccount should have balance $expTargetBalance")
        targetAccount.balance shouldBe expTargetBalance
      }
    }
  }
}

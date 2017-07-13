package sample

object TransferService {
  def transfer(srcAccount: Account, targetAccount: Account, amount: Double) = {
    srcAccount.balance -= amount
    targetAccount.balance += amount
  }
}

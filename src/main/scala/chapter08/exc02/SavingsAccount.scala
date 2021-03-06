package chapter08.exc02

import chapter08.exc01.BankAccount

/**
 * Extend the BankAccount class of the preceding exercise to a class
 * SavingAccount that earns interest every month (when a method earnMonthlyInterest is called)
 * and that has three free deposits or withdrawals every month. Reset the transaction count
 * in the earnMonthlyInterest method.
 *
 * Created by Kirill Feoktistov on 30.05.14
 */

class SavingsAccount(initialBalance: Double, interest: Double) extends BankAccount(initialBalance) {
  val maxFreeTransactions = 3
  var freeTransactionNumber: Int = _
  val operationFee: Int = 1
  var totalFee: Double = _

  def earnMonthlyInterest() = {
    freeTransactionNumber = 0
    super.deposit(super.withdraw(0) * interest / 100)
  }

  override def deposit(amount: Double) = {
    super.deposit(amount - calculateFee())
  }

  override def withdraw(amount: Double) = {
    super.deposit(amount + calculateFee())
  }


  private def calculateFee() = {
    if (freeTransactionNumber < maxFreeTransactions) {
      freeTransactionNumber += 1
      0
    } else {
      totalFee += operationFee
      operationFee
    }
  }
}

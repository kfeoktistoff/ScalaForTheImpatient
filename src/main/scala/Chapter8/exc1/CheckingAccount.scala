package Chapter8.exc1

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  var totalFee: Double = _

  val operationFee: Double = 1

  override def deposit(amount: Double) = {
    totalFee += operationFee
    super.deposit(amount - operationFee)
  }

  override def withdraw(amount: Double) = {
    totalFee += operationFee
    super.withdraw(amount + operationFee)
  }
}

package Chapter8.exc1

/**
 * Not modifiable class
 * Created by Kirill Feoktistov on 30.05.14
 */

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount;
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount;
    balance
  }
}

package exc2

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class BankAccount {
  private var balancePrivate: Int = _

  def deposit(value: Int) = {
    if (value < 0) throw new IllegalArgumentException()
    balancePrivate += value
  }

  def withdraw(value: Int) = {
    if (balancePrivate > value) {
      balancePrivate -= value
      value
    } else 0
  }

  def balance = balancePrivate
}
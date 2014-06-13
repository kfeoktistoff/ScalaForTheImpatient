package chapter08.exc01

/**
 * Extend the following BankAccount class to a CheckingAccount class that
 * charges $1 for every deposit and withdrawal.
 *
 * class BankAccount(initialBalance: Double) {
 * private var balance = initialBalance
 * def deposit(amount:Double) = { balance += amount; balance }
 * def withdraw(amount:Double) = { balance -= amount; balance }
 *
 * Created by Kirill Feoktistov on 30.05.14
 */

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

package chapter08.exc01

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class CheckingAccountSpec extends FlatSpec with Matchers {
  "A CheckingAccount" should "increase balance and get $1 fee for each deposit operation" in {
    val account: CheckingAccount = new CheckingAccount(0)
    account.deposit(5) shouldBe 4
    account.totalFee shouldBe 1
  }

  "A CheckingAccount" should "decrease balance and get $1 fee for each withdraw operation" in {
    val account: CheckingAccount = new CheckingAccount(0)
    account.withdraw(5) shouldBe -6
    account.totalFee shouldBe 1
  }

  "A CheckingAccount" should "increase total fee from each operation" in {
    val account: CheckingAccount = new CheckingAccount(0)
    account.withdraw(5)
    account.deposit(15)
    account.withdraw(5)
    account.totalFee shouldBe 3
  }
}

package Chapter5.exc2

import exc2.BankAccount
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class BankAccountSpec extends FlatSpec with Matchers {
  "A BankAccount" must "increase balance after deposit for deposit value" in {
    val ba = new BankAccount()
    ba.balance shouldBe 0
    ba.deposit(5)
    ba.balance shouldBe 5
  }

  "A BankAccount" must "throw IllegalArgumentException if deposit value < 0" in {
    a[IllegalArgumentException] should be thrownBy {
      new BankAccount().deposit(-2)
    }
  }

  "A BankAccount" must "return 0 if balance is lower than withdraw value" in {
    val ba = new BankAccount()
    ba.deposit(5)
    ba.withdraw(10) shouldBe 0
  }

  "A BankAccount" must "return withdraw value if balance is higher than withdraw value" in {
    val ba = new BankAccount()
    ba.deposit(10)
    ba.withdraw(5) shouldBe 5
  }
}

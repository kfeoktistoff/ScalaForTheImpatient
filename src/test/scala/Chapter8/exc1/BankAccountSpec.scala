package Chapter8.exc1

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class BankAccountSpec extends FlatSpec with Matchers {
  "A BankAccount" should "increase and return balance after deposit method calling" in {
    new BankAccount(0).deposit(5) shouldBe 5
  }

  "A BankAccount" should "decrease and return balance after withdraw method calling" in {
    new BankAccount(0).withdraw(5) shouldBe -5
  }
}

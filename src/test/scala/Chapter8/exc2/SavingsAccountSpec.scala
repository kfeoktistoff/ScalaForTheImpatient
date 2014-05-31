package Chapter8.exc2

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class SavingsAccountSpec extends FlatSpec with Matchers {
  "A SavingsAccount" should "provide first 3 operation for free" in {
    val account = new SavingsAccount(0, 10)
    account deposit 1
    account deposit 1
    account deposit 1 shouldBe 3
    account.totalFee shouldBe 0
    account deposit 1 shouldBe 3
    account.totalFee shouldBe 1
  }

  "A SavingsAccount" should "provide first 3 operation after earnMonthlyInterest calling" in {
    val account = new SavingsAccount(0, 10)
    account deposit 10
    account deposit 10
    account deposit 10 shouldBe 30
    account.totalFee shouldBe 0
    account deposit 10
    account.totalFee shouldBe 1
    account.earnMonthlyInterest()
    account deposit 10
    account.totalFee shouldBe 1
  }

  "A SavingsAccount" should "increase balance after earnMonthlyInterest calling according to interest" in {
    new SavingsAccount(100, 10).earnMonthlyInterest() shouldBe 110
  }
}

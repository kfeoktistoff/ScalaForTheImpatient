package chapter11.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 19.06.14
 */

class MoneySpec extends FlatSpec with Matchers {
  "A Money" should "return $4.25 when $1.75 + $2.50" in {
    Money(1, 75) + Money(2, 50) shouldBe Money(4, 25)
  }

  "A Money" should "return $0.75 when $2.50 - $1.75" in {
    Money(2, 50) - Money(1, 75) shouldBe Money(0, 75)
  }

  "A Money" should "return $0.25 when $2.50 - $2.25" in {
    Money(2, 50) - Money(2, 25) shouldBe Money(0, 25)
  }

  "A Money" should "return -$0.25 when $2.25 - $2.50" in {
    Money(0, -25) - Money(2, 25) shouldBe Money(-2, -50)
  }

  "A Money.toString" should "return $1.25 for Money(1, 25)" in {
    Money(1, 25).toString shouldBe "$1.25"
  }

  "A Money.toString" should "return -$0.25 for Money(0, -25)" in {
    Money(0, -25).toString shouldBe "-$0.25"
  }

  "A Money.toString" should "return -$1.25 for Money(-1, -25)" in {
    Money(-1, -25).toString shouldBe "-$1.25"
  }

  "A Money.toString" should "return -$0.75 for Money(-1, 25)" in {
    Money(-1, 25).toString shouldBe "-$0.75"
  }

  "A Money.toString" should "return $0.75 for Money(0, 175)" in {
    Money(0, 175).toString shouldBe "$1.75"
  }

  "A Money.toString" should "return -$1.75 for Money(0, -175)" in {
    Money(0, -175).toString shouldBe "-$1.75"
  }

  "A Money.toString" should "return $0.75 for Money(1, -25)" in {
    Money(1, -25).toString shouldBe "$0.75"
  }

  "A Money.==" should "return true for $1.25 and $1.25 " in {
    Money(1, 25) == Money(1, 25) shouldBe true
  }

  "A Money.<" should "return true for $1.25 and $1.26 " in {
    Money(1, 25) < Money(1, 26) shouldBe true
  }

  "A Money.<" should "return false for $1.25 and $0.25 " in {
    Money(1, 25) < Money(0, 25) shouldBe false
  }
}

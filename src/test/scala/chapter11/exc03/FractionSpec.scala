package chapter11.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 17.06.14
 */

class FractionSpec extends FlatSpec with Matchers {
  "A Fraction" should "properly calculate addition operation" in {
    new Fraction(3, 4) + new Fraction(2, 4) shouldBe new Fraction(5, 4)
    new Fraction(3, 4) + new Fraction(-2, 4) shouldBe new Fraction(1, 4)
  }

  "A Fraction" should "properly calculate multiplication operation" in {
    new Fraction(3, 4) * new Fraction(2, 4) shouldBe new Fraction(3, 8)
  }

  "A Fraction" should "properly calculate division operation" in {
    new Fraction(8, 15) / new Fraction(2, 5) shouldBe new Fraction(4, 3)
  }

  "A Fraction" should "properly calculate subtraction operation" in {
    new Fraction(8, 15) - new Fraction(2, 5) shouldBe new Fraction(2, 15)
  }
}

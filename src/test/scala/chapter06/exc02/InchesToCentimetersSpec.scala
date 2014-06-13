package chapter06.exc02

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class InchesToCentimetersSpec extends FlatSpec with Matchers {
  "A InchesToCentimeters" should "extend UnitConversion class" in {
    InchesToCentimeters shouldBe an[UnitConversion]
  }

  "A InchesToCentimeters" should "correctly convert inches to centimeters after calling inchesToCentimeters" in {
    InchesToCentimeters.inchesToCentimeters(0.393701) shouldBe 1.0 +- 0.1
  }
}
package Chapter6.exc2

import org.scalatest.{Matchers, FlatSpec}

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
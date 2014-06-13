package chapter06.exc02

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class MilesToKilometersSpec extends FlatSpec with Matchers {
  "A MilesToKilometers" should "extend UnitConversion class" in {
    MilesToKilometers shouldBe an[UnitConversion]
  }

  "A MilesToKilometers" should "correctly convert miles to km after calling milesToKilometers" in {
    MilesToKilometers.milesToKilometers(1.60934) shouldBe 1.0 +- 0.1
  }
}

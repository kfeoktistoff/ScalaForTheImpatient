package chapter06.exc02

import org.scalatest._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class GallonsToLitersSpec extends FlatSpec with Matchers {
  "A GallonsToLiters" should "extend UnitConversion class" in {
    GallonsToLiters shouldBe an[UnitConversion]
  }

  "A GallonsToLiters" should "correctly convert gallons to liters after calling gallonsToLiters" in {
    GallonsToLiters.gallonsToLiters(3.78541) shouldBe 1.0 +- 0.1
  }


}

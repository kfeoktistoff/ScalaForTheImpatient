package Chapter6.exc1

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class ConversionsSpec extends FlatSpec with Matchers {
  "A Conversions" should "correctly convert miles to km after calling milesToKilometers" in {
    Conversions.milesToKilometers(1.60934) shouldBe 1.0 +- 0.1
  }

  "A Conversions" should "correctly convert gallons to liters after calling gallonsToLiters" in {
    Conversions.gallonsToLiters(3.78541) shouldBe 1.0 +- 0.1
  }

  "A Conversions" should "correctly convert inches to centimeters after calling inchesToCentimeters" in {
    Conversions.inchesToCentimeters(0.393701) shouldBe 1.0 +- 0.1
  }
}

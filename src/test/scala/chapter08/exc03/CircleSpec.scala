package chapter08.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class CircleSpec extends FlatSpec with Matchers {
  "A Rectangle" should "calculate circle square using formula PI*radius^2" in {
    val radius = 10
    new Circle(radius).square() shouldBe Math.PI * Math.pow(radius, 2) +- 2
  }

  "A Rectangle" should "calculate throw UnsupportedOperationException if perimeter method called" in {
    an[UnsupportedOperationException] shouldBe thrownBy {
      new Circle(10).perimeter()
    }
  }
}

package chapter08.exc06

import chapter08.exc05.Point
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class CircleSpec extends FlatSpec with Matchers {
  "A Circle" should "extend Shape class" in {
    new Circle(centerX = 0, centerY = 0, radius = 5) shouldBe a[Shape]
  }

  "A Circle" should "throw IllegalArgumentException if radius < 0" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      new Circle(centerX = 0, centerY = 0, radius = -5)
    }
  }

  "A Circle" should "return centerPoint according information passed in c-tor" in {
    new Circle(centerX = 3, centerY = 5, radius = 5).centerPoint() shouldBe new Point(3, 5)
  }
}

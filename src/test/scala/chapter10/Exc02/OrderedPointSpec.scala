package chapter10.Exc02

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class OrderedPointSpec extends FlatSpec with Matchers {
  "An OrderedPoint" should "be bigger than another one if x > another.x" in {
    new OrderedPoint(3, 5).compare(new OrderedPoint(1, 5)) shouldBe 1
    new OrderedPoint(1, 5).compare(new OrderedPoint(3, 5)) shouldBe -1
  }

  "An OrderedPoint" should "be bigger than another one if x = another.x and y > another.y" in {
    new OrderedPoint(3, 10).compare(new OrderedPoint(3, 5)) shouldBe 1
    new OrderedPoint(3, 5).compare(new OrderedPoint(3, 10)) shouldBe -1
  }

  "An OrderedPoint" should "be equal to another one if x = another.x and y = another.y" in {
    new OrderedPoint(3, 5).compare(new OrderedPoint(3, 5)) shouldBe 0
  }
}

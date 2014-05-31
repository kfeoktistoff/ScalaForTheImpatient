package Chapter8.exc3

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class RectangleSpec extends FlatSpec with Matchers {
  "A Rectangle" should "calculate perimeter using formula 2*a+2*b" in {
    val a: Int = 3
    val b: Int = 6
    new Rectangle(a, b).perimeter() shouldBe 2 * a + 2 * b
  }

  "A Rectangle" should "calculate square using formula a*b" in {
    val a: Int = 3
    val b: Int = 6
    new Rectangle(a, b).square() shouldBe a * b
  }
}

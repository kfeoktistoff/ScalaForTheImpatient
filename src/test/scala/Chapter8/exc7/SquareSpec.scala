package Chapter8.exc7

import org.scalatest.{Matchers, FlatSpec}
import Chapter8.exc5.Point

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class SquareSpec extends FlatSpec with Matchers {
  "A Square" should "throw IllegalArgumentException if side < 0" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      new Square(-5)
    }
  }

  "A Square" should "use 0 values for bottom left corner and side by default" in {
    val square: Square = new Square()
    square.x shouldBe 0
    square.y shouldBe 0
    square.width shouldBe 0
    square.height shouldBe 0
  }

  "A Square" should "use 0 values for bottom left corner by default" in {
    val square: Square = new Square(5)
    square.x shouldBe 0
    square.y shouldBe 0
    square.width shouldBe 5
    square.height shouldBe 5
  }

  "A Square" should "use 0 value for side by default" in {
    val square: Square = new Square(new Point(1, 3))
    square.x shouldBe 1
    square.y shouldBe 3
    square.width shouldBe 0
    square.height shouldBe 0
  }
}

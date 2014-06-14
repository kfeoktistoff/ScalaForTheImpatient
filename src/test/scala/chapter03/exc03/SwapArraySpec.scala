package chapter03.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class SwapArraySpec extends FlatSpec with Matchers {
  "SwapArray function" should "swap neighbour elements in an array with even elements number" in {
    swapArray(Array(1, 2, 3, 4, 5)) shouldBe Array(2, 1, 4, 3, 5)
  }

  "SwapArray function" should "swap neighbour elements in an array with odd elements number" in {
    swapArray(Array(1, 2, 3, 4, 5, 6)) shouldBe Array(2, 1, 4, 3, 6, 5)
  }

  "SwapArray function" should "return same array if it contains only 1 element" in {
    swapArray(Array(1)) shouldBe Array(1)
  }

  "SwapArray function" should "return same array if it is empty" in {
    swapArray(Array()) shouldBe Array()
  }
}

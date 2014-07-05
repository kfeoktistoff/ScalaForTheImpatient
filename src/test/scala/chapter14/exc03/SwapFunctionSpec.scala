package chapter14.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class SwapFunctionSpec extends FlatSpec with Matchers {
  "Swap function" should "return input array if it contains 1 element" in {
    swap(Array(0)) should contain only 0
  }

  "Swap function" should "return input array if it is empty" in {
    swap(Array()) shouldBe empty
  }

  "Swap function" should "swap first 2 elements in array" in {
    swap(Array(0, 1, 2, 3, 4)) should contain inOrderOnly(1, 0, 2, 3, 4)
  }
}

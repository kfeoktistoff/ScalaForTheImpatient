package chapter13.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class GroupArrayFunctionSpec extends FlatSpec with Matchers {
  "GroupArray function" should "return array of arrays of group size of n elements of the passed array" in {
    groupArray(Array(1, 2, 3, 4, 5, 6), 3) shouldBe Array(Array(1, 2, 3), Array(4, 5, 6))
    groupArray(Array(1, 2, 3, 4, 5, 6), 2) shouldBe Array(Array(1, 2), Array(3, 4), Array(5, 6))
    groupArray(Array(1, 2, 3, 4, 5), 3) shouldBe Array(Array(1, 2, 3), Array(4, 5))
  }
}

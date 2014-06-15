package chapter03.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class DropNegativeExceptFirstFunctionSpec extends FlatSpec with Matchers {
  "DropNegativeExceptFirst function" should "remove all negative elements in an array except the first one" in {
    dropNegativeExceptFirst(Array(-3, -2, -1, 0, 1, 2, 3)) shouldBe Array(-3, 0, 1, 2, 3)
  }
}

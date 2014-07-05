package chapter13.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class ReverseListFunctionSpec extends FlatSpec with Matchers {
  "ReverseList function" should "return reversed list" in {
    reverseList(List[Int](0, 1, 2, 3, 4)) shouldBe List[Int](4, 3, 2, 1, 0)
  }
}

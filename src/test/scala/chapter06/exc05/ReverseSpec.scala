package chapter06.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class ReverseSpec extends FlatSpec with Matchers {
  "A Reverse" should "return empty string after reverseArray call with empty array passed" in {
    Reverse.reverseArray(Array()) shouldBe empty
  }

  "A Reverse" should "return empty string after reverseArray call if null array passed" in {
    Reverse.reverseArray(null) shouldBe empty
  }

  "A Reverse" should "return values split with space of passed array in reversed order" in {
    Reverse.reverseArray(Array("one", "two")) shouldBe "two one"
  }

  "A Reverse" should "return element if passed array with only the element" in {
    Reverse.reverseArray(Array("one")) shouldBe "one"
  }
}

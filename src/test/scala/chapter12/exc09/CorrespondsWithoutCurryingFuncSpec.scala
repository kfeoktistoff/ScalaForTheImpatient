package chapter12.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class CorrespondsWithoutCurryingFuncSpec extends FlatSpec with Matchers {
  val lengthMatching = (string: String, length: Int) => string.length == length

  "CorrespondsWithoutCurrying function" should "" in {
    correspondsWithoutCurrying(lengthMatching, Array("Hello", "World"), Array(5, 5)) shouldBe true
  }

  "MatchStringLengths function" should "return false if at least one string length does not match passed lengths" in {
    correspondsWithoutCurrying(lengthMatching, Array("Hello", "World"), Array(5, 4)) shouldBe false
  }
}

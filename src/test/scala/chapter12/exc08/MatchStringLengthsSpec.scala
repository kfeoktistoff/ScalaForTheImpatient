package chapter12.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class MatchStringLengthsSpec extends FlatSpec with Matchers {
  "MatchStringLengths function" should "return true if all string lengths match passed lengths" in {
    matchStringLengths(Array("Hello", "World"), Array(5, 5)) shouldBe true
  }

  "MatchStringLengths function" should "return false if at least one string length does not match passed lengths" in {
    matchStringLengths(Array("Hello", "World"), Array(5, 4)) shouldBe false
  }
}

package chapter13.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class FindInMapFunctionSpec extends FlatSpec with Matchers {
  "FindInMap function" should "return collection of integers matched in passed map" in {
    findInMap(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)) shouldBe Array(3, 5)
  }
}

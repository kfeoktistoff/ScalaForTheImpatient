package chapter03.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class ReplaceElementsSpec extends FlatSpec with Matchers {
  "ReplaceElements function" should "return array with positive elements first saving initial order" in {
    replaceElements(Array(-2, -1, 0, 1, 2, 3)) shouldBe Array(1, 2, 3, -2, -1, 0)
  }
}

package chapter04.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class LlteqgtFunctionSpec extends FlatSpec with Matchers {
  "llteqgt function" should "return tuple with less than, equal and greater than threshold" in {
    lteqgt(Array(1, 2, 3, 3, 3, 4, 5, 6, 7), 3) shouldBe(2, 3, 4)
  }
}

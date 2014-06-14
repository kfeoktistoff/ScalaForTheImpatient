package chapter03.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class UniqueFunctionSpec extends FlatSpec with Matchers {
  "Unique function" should "return array with unique elements only" in {
    unique(Array(1, 1, 2, 2, 3, 3)) shouldBe Array(1, 2, 3)
  }
}

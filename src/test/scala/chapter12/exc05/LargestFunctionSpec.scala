package chapter12.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class LargestFunctionSpec extends FlatSpec with Matchers {
  "Largest function" should "maximal value of collection modified with the function" in {
    largest(x => 10 * x - x * x, 1 to 10) shouldBe 25
  }
}

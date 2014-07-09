package chapter12.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class LargestAtFunctionSpec extends FlatSpec with Matchers {
  "Largest function" should "maximal value of collection modified with the function" in {
    largestAt(x => 10 * x - x * x, 1 to 10) shouldBe 5
  }
}

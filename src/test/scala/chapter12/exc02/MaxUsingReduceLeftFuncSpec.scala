package chapter12.exc02

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class MaxUsingReduceLeftFuncSpec extends FlatSpec with Matchers {
  "MaxUsingReduceLeft function" should "max element of the array" in {
    maxUsingReduceLeft(Array(-5, 5, 2, 0, 4)) shouldBe 5
  }
}

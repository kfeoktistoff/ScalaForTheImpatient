package chapter02.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class PowRecursiveFunctionSpec extends FlatSpec with Matchers {
  "A pow function" should "return 1 for x^0" in {
    pow(2, 0) shouldBe 1
  }

  "A pow function" should "return 16 for 2^4" in {
    pow(2, 4) shouldBe 16
  }

  "A pow function" should "return 32 for 2^5" in {
    pow(2, 5) shouldBe 32
  }
}

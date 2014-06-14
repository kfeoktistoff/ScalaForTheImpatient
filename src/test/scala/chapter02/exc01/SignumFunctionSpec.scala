package chapter02.exc01

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class SignumFunctionSpec extends FlatSpec with Matchers {
  "A signum function" should "return 0 if 0 passed" in {
    signum(0) shouldBe 0
  }

  "A signum function" should "return -1 if negative value passed" in {
    signum(-5) shouldBe -1
  }

  "A signum function" should "return 1 if positive value passed" in {
    signum(5) shouldBe 1
  }
}

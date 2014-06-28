package chapter12.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class FactorialUsingReduceLeftFuncSpec extends FlatSpec with Matchers {
  "FactorialUsingReduceLeft function" should "return 720 as a factorial of 6" in {
    factorialUsingReduceLeft(6) shouldBe 720
  }

  "FactorialUsingReduceLeft function" should "return 1 as a factorial of 0" in {
    factorialUsingReduceLeft(0) shouldBe 1
  }

  "FactorialUsingReduceLeft function" should "throw IllegalArgumentException if negative value passed" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      factorialUsingReduceLeft(-1)
    }
  }
}

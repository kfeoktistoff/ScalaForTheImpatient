package chapter15.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 26.07.14
 */

class FactorialFunctionSpec extends FlatSpec with Matchers {
  "Factorial function" should "return 6 as result of factorial(3)" in {
    factorial(3) shouldBe 6
  }

  "Factorial function" should "return 1 as result of factorial(0)" in {
    factorial(0) shouldBe 1
  }

  "Factorial function" should "throw AssertionError if negative agrument passed" in {
    an[AssertionError] shouldBe thrownBy {
      factorial(-1) shouldBe 1
    }
  }
}

package chapter12.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class FactorialUsingFoldLeftFuncSpec extends FlatSpec with Matchers {
  "FactorialUsingFoldLeft function" should "return 720 as a factorial of 6" in {
    factorialUsingFoldLeft(6) shouldBe 720
  }

  "FactorialUsingFoldLeft function" should "return 1 as a factorial of 0" in {
    factorialUsingFoldLeft(0) shouldBe 1
  }

  "FactorialUsingFoldLeft function" should "throw IllegalArgumentException if negative value passed" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      factorialUsingFoldLeft(-1)
    }
  }
}
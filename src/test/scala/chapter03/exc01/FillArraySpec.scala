package chapter03.exc01

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class FillArraySpec extends FlatSpec with Matchers {
  "FillArray function" should "return empty array if 0 passed" in {
    fillArray(0) shouldBe Array[Int]()
  }

  "FillArray function" should "return array of Int filled [0, n)" in {
    fillArray(5) shouldBe Array[Int](0, 1, 2, 3, 4)
  }

  "FillArray function" should "throw IllegalArgumentException if n < 0 passed" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      fillArray(-1)
    }
  }
}

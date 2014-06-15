package chapter04.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class MinMaxSpec extends FlatSpec with Matchers {
  "MinMax function" should "return a pair with min and max element of an array" in {
    minmax(Array(0, 1, 2, 3, 4, 5)) shouldBe(0, 5)
  }
}

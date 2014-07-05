package chapter14.exc02

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class SwapFunctionSpec extends FlatSpec with Matchers {
  "Swap function" should "swap key and value in (Int, Int) pair" in {
    swap((1, 2)) shouldBe(2, 1)
  }
}

package chapter12.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class AdjustToPairFuncSpec extends FlatSpec with Matchers {
  "AdjustToPair function" should "return result of applying function to pair" in {
    adjustToPair(_ * _)((6, 7)) shouldBe 42
  }
}

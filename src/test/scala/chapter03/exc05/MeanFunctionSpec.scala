package chapter03.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class MeanFunctionSpec extends FlatSpec with Matchers {
  "Mean function" should "return average value of an array" in {
    mean(Array(1.0, 1.5, 5.5, 1)) shouldBe 2.25 +- 0.2
  }
}

package chapter08.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class LabeledPointSpec extends FlatSpec with Matchers {
  "A LabeledPoint" should "extent Point class" in {
    new LabeledPoint("label", 0, 0) shouldBe a[Point]
  }
}

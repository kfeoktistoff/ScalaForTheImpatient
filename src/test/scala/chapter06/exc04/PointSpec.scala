package chapter06.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class PointSpec extends FlatSpec with Matchers {
  "A point" should "instance without new" in {
    val p: Point = Point(3.0, 4.0)
    p.x shouldBe 3.0
    p.y shouldBe 4.0
  }
}

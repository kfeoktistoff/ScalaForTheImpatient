package chapter06.exc03

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class OriginSpec extends FlatSpec with Matchers {
  "An Origin" should "extend java.awt.Point" in {
    Origin shouldBe a[java.awt.Point]
  }
}

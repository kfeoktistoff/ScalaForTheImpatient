package Chapter6.exc3

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class OriginSpec extends FlatSpec with Matchers {
  "An Origin" should "extend java.awt.Point" in {
    Origin shouldBe a[java.awt.Point]
  }
}

package chapter12.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

class UnlessFunctionSpec extends FlatSpec with Matchers {
  "Unless function" should "work like 'if' but with inverted condition" in {
    var x = 0

    unless(2 < 1) {
      x = 1
    }

    x shouldBe 1

    unless(2 > 1) {
      x = 0
    }

    x shouldBe 1
  }
}

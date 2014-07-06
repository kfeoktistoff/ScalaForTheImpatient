package chapter14.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class ComposeFunctionSpec extends FlatSpec with Matchers {
  "Compose function" should "" in {
    val f = (x: Double) => if (x >= 0) Some(math.sqrt(x)) else None
    val g = (x: Double) => if (x != 1) Some(1 / (x - 1)) else None
    val h = compose(f, g)

    h(2) shouldBe Some(1)
    h(1) shouldBe None
    h(0) shouldBe None
  }
}

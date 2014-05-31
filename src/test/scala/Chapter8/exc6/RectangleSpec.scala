package Chapter8.exc6

import org.scalatest.{Matchers, FlatSpec}
import Chapter8.exc5.Point

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class RectangleSpec extends FlatSpec with Matchers {
  "A Rectangle" should "be a Shape" in {
    new Rectangle(new Point(0, 0), 0, 0) shouldBe a[Shape]
  }

  "A Rectangle" should "throw IllegalArgumentException if at least one of its sides < 0" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      new Rectangle(new Point(0, 0), 5, -5)
    }
    an[IllegalArgumentException] shouldBe thrownBy {
      new Rectangle(new Point(0, 0), -5, 5)
    }
  }

  "A Rectangle" should "calculate centerPoint as half of its sides plus offset according to bottom right corner" in {
    new Rectangle(new Point(0, 0), 5, 10).centerPoint() shouldBe new Point(2.5, 5)
    new Rectangle(new Point(3, 5), 5, 10).centerPoint() shouldBe new Point(5.5, 10)
  }
}

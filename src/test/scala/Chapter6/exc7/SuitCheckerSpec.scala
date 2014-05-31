package Chapter6.exc7

import org.scalatest.{Matchers, FlatSpec}
import Chapter6.exc6.Suit._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class SuitCheckerSpec extends FlatSpec with Matchers {
  "A SuitChecker" should "return true after isRed method called with Heart passed" in {
    SuitChecker.isRed(Hearts) shouldBe true
  }

  "A SuitChecker" should "return true after isRed method called with Diamonds passed" in {
    SuitChecker.isRed(Diamonds) shouldBe true
  }

  "A SuitChecker" should "return true after isRed method called with Spades passed" in {
    SuitChecker.isRed(Spades) shouldBe false
  }

  "A SuitChecker" should "return true after isRed method called with Clubs passed" in {
    SuitChecker.isRed(Clubs) shouldBe false
  }
}

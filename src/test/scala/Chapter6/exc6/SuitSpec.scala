package Chapter6.exc6

import org.scalatest.{Matchers, FlatSpec}
import Suit._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class SuitSpec extends FlatSpec with Matchers {
  "A Suit" should "return ♥ after Hearts.toString called" in {
    Hearts.toString shouldBe "♥"
  }

  "A Suit" should "return ♠ after Spades.toString called" in {
    Spades.toString shouldBe "♠"
  }

  "A Suit" should "return ♦ after Diamonds.toString called" in {
    Diamonds.toString shouldBe "♦"
  }

  "A Suit" should "return ♣ after Clubs.toString called" in {
    Clubs.toString shouldBe "♣"
  }
}

package Chapter6.exc6

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object Suit extends Enumeration {
  type Suit = Value
  val Hearts = Value("♥")
  val Spades = Value("♠")
  val Diamonds = Value("♦")
  val Clubs = Value("♣")
}

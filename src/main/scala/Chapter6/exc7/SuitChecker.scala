package Chapter6.exc7

import Chapter6.exc6.Suit._

/**
 * Implement a function that checks whether a card suit value from the preceding exercise is red.
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

object SuitChecker {
  def isRed(suit: Suit) = {
    suit == Hearts || suit == Diamonds
  }
}

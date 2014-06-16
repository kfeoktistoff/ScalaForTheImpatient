package chapter04

/**
 * Set up a map of prices for a number of gizmos that you covet. Then
 * produce a second map with the same keys and the prices at a 10 percent discount.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc01 {
  val initialPrices = Map("Phone" -> 100, "Tablet" -> 150, "Book" -> 30)
  val droppedPrices = for ((k, v) <- initialPrices) yield (k, v - v * 0.1)
}

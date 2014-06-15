package chapter04

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc01 {
  val initialPrices = Map("Phone" -> 100, "Tablet" -> 150, "Book" -> 30)
  val droppedPrices = for ((k, v) <- initialPrices) yield (k, v - v * 0.1)
}

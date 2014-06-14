package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc06 {
  def charMultiplication(): Long = {
    var p: Long = 1L
    for (i <- "Hello") p = p * i
    p
  }
}

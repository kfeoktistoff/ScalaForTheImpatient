package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc07 {
  def charMultiplication(): Long = {
    var p = 1L
    "Hello".foreach(p *= _)
    p
  }
}

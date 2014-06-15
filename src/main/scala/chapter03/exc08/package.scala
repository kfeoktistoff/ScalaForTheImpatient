package chapter03

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc08 {
  def dropNegativeExceptFirst(array: Array[Int]) = {
    val indexes = (for (i <- 0 until array.length if array(i) < 0) yield i).reverse.dropRight(1)
    for (i <- 0 until array.length if !(indexes contains i)) yield array(i)
  }
}

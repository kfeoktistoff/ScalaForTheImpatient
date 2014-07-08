package chapter14

/**
 * Using pattern matching, write a function swap that swaps the first two elements of an array provided its length is at least two.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc03 {
  def swap(arr: Array[Int]) = {
    arr match {
      case Array() => arr
      case Array(_) => arr
      case Array(x, y, _*) => Array(y, x) ++ (arr drop 2)
    }
  }
}

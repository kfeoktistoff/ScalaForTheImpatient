package chapter14

/**
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

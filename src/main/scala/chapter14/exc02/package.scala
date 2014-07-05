package chapter14

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc02 {
  def swap(p: (Int, Int)) = {
    p match {
      case (k: Int, v: Int) => (v, k)
    }
  }
}

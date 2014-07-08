package chapter14

/**
 * Using pattern matching, write a function swap that receives a pair of integers and returns the pair with the components swapped.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc02 {
  def swap(p: (Int, Int)) = {
    p match {
      case (k: Int, v: Int) => (v, k)
    }
  }
}

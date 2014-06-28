package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc02 {
  def maxUsingReduceLeft(input: Array[Int]) = {
    input.reduceLeft(_ max _)
  }
}

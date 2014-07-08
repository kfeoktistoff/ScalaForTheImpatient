package chapter12

/**
 * How do you get the largest element of an array with reduceLeft?
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc02 {
  def maxUsingReduceLeft(input: Array[Int]) = {
    input.reduceLeft(_ max _)
  }
}

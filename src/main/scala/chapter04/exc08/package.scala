package chapter04

/**
 * Write a function minmax(values: Array[Int]) that returns a pair containing
 * the smallest and largest value in the array.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc08 {
  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }
}

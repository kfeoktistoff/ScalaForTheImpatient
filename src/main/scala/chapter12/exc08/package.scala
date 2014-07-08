package chapter12

/**
 * In Section 12.8, “Currying,” on page 149, you saw the corresponds method used with two arrays of strings.
 * Make a call to corresponds that checks whether the elements in an array of strings have the lengths
 * given in an array of integers.
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc08 {
  def matchStringLengths(strings: Array[String], lengths: Array[Int]) = {
    strings.corresponds(lengths)(_.length == _)
  }
}

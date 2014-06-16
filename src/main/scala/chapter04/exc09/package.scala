package chapter04

/**
 * Write a function lteqgt(values: Array[Int], v: Int) that returns a triple
 * containing count of values less than v, equal to v, and greater than v.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc09 {
  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }
}

package chapter04

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc09 {
  def lteqgt(values: Array[Int], v: Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }
}

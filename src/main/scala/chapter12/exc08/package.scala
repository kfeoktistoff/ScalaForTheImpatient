package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc08 {
  def matchStringLengths(strings: Array[String], lengths: Array[Int]) = {
    strings.corresponds(lengths)(_.length == _)
  }
}

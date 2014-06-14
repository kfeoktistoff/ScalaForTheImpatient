package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc08 {
  def product(line: String): Long = {
    var p: Long = 1
    line.foreach(p *= _)
    p
  }
}

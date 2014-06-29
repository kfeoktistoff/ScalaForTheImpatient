package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc10 {
  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
    }
  }
}

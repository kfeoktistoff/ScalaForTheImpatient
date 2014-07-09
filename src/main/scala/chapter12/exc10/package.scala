package chapter12

/**
 * Implement an unless control abstraction that works just like if, but with an inverted condition. Does the first
 * parameter need to be a call-by-name parameter? Do you need currying?
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc10 {
  def unless(condition: => Boolean)(block: => Unit) {
    if (!condition) {
      block
    }
  }
}

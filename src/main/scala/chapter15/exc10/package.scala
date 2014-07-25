package chapter15

/**
 * Created by Kirill Feoktistov on 26.07.14
 */

package object exc10 {
  def factorial(n: Int): Int = {
    assert(n >= 0)
    if (n == 0) 1 else n * factorial(n - 1)
  }
}

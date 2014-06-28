package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc04 {
  def factorialUsingFoldLeft(n: Int) = {
    if (n < 0) throw new IllegalArgumentException("Factorial is defined for non-negative values only")
    (1 to n).foldLeft(1)(_ * _)
  }
}

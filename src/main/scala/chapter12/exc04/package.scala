package chapter12

/**
 * The previous implementation needed a special case when n < 1. Show how you can avoid this with foldLeft.
 * (Look at the Scaladoc for foldLeft. It’s like reduceLeft, except that the first value in the chain of
 * combined values is supplied in the call.)
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc04 {
  def factorialUsingFoldLeft(n: Int) = {
    if (n < 0) throw new IllegalArgumentException("Factorial is defined for non-negative values only")
    (1 to n).foldLeft(1)(_ * _)
  }
}

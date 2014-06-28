package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc03 {
  def factorialUsingReduceLeft(x: Int) = {
    if (x < 0) throw new IllegalArgumentException("Factorial is defined for non-negative values only")
    if (x == 0) 1 else (1 to x) reduceLeft (_ * _)
  }
}

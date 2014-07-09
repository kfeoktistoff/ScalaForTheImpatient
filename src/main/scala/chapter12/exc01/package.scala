package chapter12

/**
 * Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection of function inputs and
 * outputs in a given range. For example, values(x => x * x, -5, 5) should produce a collection of
 * pairs (-5, 25), (-4, 16), (-3, 9), . . ., (5, 25).
 *
 * Created by Kirill Feoktistov on 28.06.14
 */

package object exc01 {
  def values(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).zip((low to high) map fun)
  }
}

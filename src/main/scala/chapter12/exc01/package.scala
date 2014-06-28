package chapter12

/**
 * Created by Kirill Feoktistov on 28.06.14
 */

package object exc01 {
  def values(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).zip((low to high) map fun)
  }
}

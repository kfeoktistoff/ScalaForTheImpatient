package chapter03

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc03 {
  def swapArray(inputArray: Array[Int]) = {
    for (i <- 0 until inputArray.length) yield {
      if (i % 2 == 0) {
        if (i + 1 < inputArray.length) {
          inputArray(i + 1)
        } else inputArray(i)
      } else inputArray(i - 1)
    }
  }
}

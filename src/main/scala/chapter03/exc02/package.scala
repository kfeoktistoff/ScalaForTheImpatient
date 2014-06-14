package chapter03

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc02 {
  def swapArray(inputArray: Array[Int]) {
    for (i <- 0 until inputArray.length) {
      if (i % 2 == 0 && i + 1 < inputArray.length) {
        val temp: Int = inputArray(i)
        inputArray(i) = inputArray(i + 1)
        inputArray(i + 1) = temp
      }
    }
  }
}

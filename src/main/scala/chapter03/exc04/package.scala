package chapter03

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc04 {
  def replaceElements(input: Array[Int]): Array[Int] = {
    val positive = new ArrayBuffer[Int]()
    val nonPositive = new ArrayBuffer[Int]()

    for (i <- 0 until input.length) {
      if (input(i) > 0) positive += input(i) else nonPositive += input(i)
    }

    (positive ++ nonPositive).toArray
  }
}

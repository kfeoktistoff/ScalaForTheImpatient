package chapter03

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc06 {
  def arrayReverseSort(array: Array[Int]): Array[Int] = {
    Sorting.quickSort(array)

    for (i <- 0 until array.length / 2) {
      val temp = array(i)
      array(i) = array(array.length - i - 1)
      array(array.length - i - 1) = temp
    }

    array
  }

  def arrayBufferReverseSort(array: ArrayBuffer[Int]): ArrayBuffer[Int] = {
    array.sortWith(_ > _)
  }
}

package chapter03

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc01 {
  def fillArray(n: Int): Array[Int] = {
    if (n < 0) throw new IllegalArgumentException("n should be >= 0")

    val array: Array[Int] = new Array[Int](n)

    for (i <- 0 until n) {
      array(i) = i
    }

    array
  }
}

package chapter13

import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 01.07.14
 */

package object exc01 {
  def indexes(input: String) = {
    val ind = new mutable.HashMap[Char, mutable.TreeSet[Int]]

    for (i <- 0 until input.length) {
      ind += (input(i) -> (ind.getOrElse(input(i), new mutable.TreeSet[Int]) + i))
    }
    ind
  }
}

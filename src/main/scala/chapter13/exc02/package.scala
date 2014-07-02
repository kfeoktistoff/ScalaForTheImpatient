package chapter13

import scala.collection.immutable

/**
 * Created by Kirill Feoktistov on 02.07.14
 */

package object exc02 {
  def indexes(input: String) = {
    var ind = new immutable.HashMap[Char, immutable.TreeSet[Int]]

    for (i <- 0 until input.length) {
      ind = ind + (input(i) -> (ind.getOrElse(input(i), new immutable.TreeSet[Int]) + i))
    }
    ind
  }
}

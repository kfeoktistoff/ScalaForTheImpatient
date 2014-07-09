package chapter13

import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 04.07.14
 */

package object exc03 {
  def removeZeroes(list: mutable.LinkedList[Int]) = {
    list.filterNot(_ == 0)
  }
}

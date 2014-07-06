package chapter14

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc09 {
  def sum(list: List[Option[Int]]) = {
    list.map(_.getOrElse(0)).sum
  }
}
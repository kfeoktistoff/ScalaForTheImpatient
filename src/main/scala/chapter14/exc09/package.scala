package chapter14

/**
 * Write a function that computes the sum of the non-None values in a List[Option[Int]]. Don’t use a match statement.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc09 {
  def sum(list: List[Option[Int]]) = {
    list.map(_.getOrElse(0)).sum
  }
}
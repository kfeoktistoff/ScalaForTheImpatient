package chapter13

/**
 *
 * Implementations from the book copy input list to another list
 * Created by Kirill Feoktistov on 05.07.14
 */

package object exc06 {
  def reverseList(lst: List[Int]) = {
    (lst :\ List[Int]())((x, y) => y :+ x)
  }
}

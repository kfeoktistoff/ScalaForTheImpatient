package chapter14

/**
 * One can use lists to model trees that store values only in the leaves. For example, the list ((3 8) 2 (5)) describes the tree
 *
 * +
 *     /|\
 * *  2  -
 *  / \    |
 * 3  8    5
 *
 * However, some of the list elements are numbers and others are lists. In Scala, you cannot have heterogeneous lists,
 * so you have to use a List[Any]. Write a leafSum function to compute the sum of all elements in the leaves,
 * using pattern matching to differentiate between numbers and lists.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc05 {
  def leafSum(leafs: List[Any]): Int = {
    leafs match {
      case List() => 0
      case List(x: Int, _*) => x + leafSum(leafs drop 1)
      case List(x: List[Int], _*) => leafSum(x) + leafSum(leafs drop 1)
      case _ => throw new IllegalArgumentException("Only Int and List[Int] are supported")
    }
  }
}

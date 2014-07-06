package chapter14

/**
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

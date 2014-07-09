package chapter13

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

package object exc07 {
  def zipAndProduct(first: Iterable[Double], second: Iterable[Int]) = {
    val productKeyValue = ((x: Double, y: Int) => x * y).tupled
    (first zipAll(second, 0.0, 0)) map productKeyValue
  }
}
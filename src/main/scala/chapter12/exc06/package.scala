package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc06 {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.sortWith(fun(_) < fun(_)).last
  }
}

package chapter12

/**
 * Modify the previous function to return the input at which the output is largest. For example,
 * largestAt(fun: (Int) => Int, inputs: Seq[Int]) should return 5. Don’t use a loop or recursion.
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc06 {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.sortWith(fun(_) < fun(_)).last
  }
}

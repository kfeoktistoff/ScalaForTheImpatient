package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc05 {
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).max
  }
}

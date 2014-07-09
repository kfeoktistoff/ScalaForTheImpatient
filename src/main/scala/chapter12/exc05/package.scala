package chapter12

/**
 * Write a function largest(fun: (Int) => Int, inputs: Seq[Int]) that yields the largest value of a function within a
 * given sequence of inputs. For example, largest(x => 10 * x - x * x, 1 to 10) should return 25.
 * Don't use a loop or recursion.
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc05 {
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).max
  }
}

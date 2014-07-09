package chapter13

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

package object exc05 {
  def customMkString(col: Iterable[Int]) = {
    col.map(_.toString).reduceLeft(_ + _)
  }

  def customMkString(col: Iterable[Int], sep: String) = {
    col.map(_.toString).reduceLeft(_ + sep + _)
  }

  def customMkString(col: Iterable[Int], start: String, sep: String, end: String) = {
    start + col.map(_.toString).reduceLeft(_ + sep + _) + end
  }
}

package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc09 {
  def product(line: String): Long = {
    val p: Long = if (line.length == 0) 1 else line.charAt(0)
    if (line.length == 0) p
    else {
      p * product(line drop 1)
    }
  }
}

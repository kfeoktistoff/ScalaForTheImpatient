package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc01 {
  def signum(x: Double) = if (x < 0) -1 else if (x > 0) 1 else 0
}

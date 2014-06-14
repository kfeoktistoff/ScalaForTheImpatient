package chapter02

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

package object exc10 {
  def pow(x: Long, n: Int): Double = {
    if (n % 2 == 0 && n > 0) pow(x, n / 2) * pow(x, n / 2)
    else if (n % 2 == 1 && n > 0) x * pow(x, n - 1)
    else if (n < 0) 1 / pow(x, -n)
    else 1
  }
}

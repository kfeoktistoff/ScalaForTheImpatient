package chapter12

/**
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc07 {
  def adjustToPair(fun: (Int, Int) => Int)(pair: (Int, Int)) = {
    fun(pair._1, pair._2)
  }
}

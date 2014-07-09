package chapter13

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

package object exc08 {
  def groupArray(input: Array[Int], colNum: Int) = {
    input.grouped(colNum).toArray
  }
}

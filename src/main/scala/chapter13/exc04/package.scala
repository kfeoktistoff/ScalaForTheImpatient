package chapter13

/**
 * Created by Kirill Feoktistov on 04.07.14
 */

package object exc04 {
  def findInMap(strings: Array[String], indexes: Map[String, Int]) = {
    strings.map(indexes get _).flatMap(x => x)
  }
}

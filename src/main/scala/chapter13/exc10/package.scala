package chapter13

import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

package object exc10 {
  def findCharFrequencies(str: String) = {
    val updateFrequency = (m: mutable.Map[Char, Int], c: Char) => {
      m + (c -> (m.getOrElse(c, 0) + 1))
    }

    val mergeMaps = (map1: mutable.Map[Char, Int], map2: mutable.Map[Char, Int]) => {
      map1 ++ map2.map { case (k, v) => k -> (v + map1.getOrElse(k, 0))}

    }

    str.par.aggregate(mutable.Map[Char, Int]())(updateFrequency, mergeMaps)
  }
}
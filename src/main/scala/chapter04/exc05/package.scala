package chapter04

import java.io.File
import java.util.Scanner

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc05 {
  def countWordsMutable(filePath: String): mutable.Map[String, Long] = {
    countWordsMutable(new Scanner(new File(filePath)))
  }

  def countWordsMutable(scanner: Scanner): mutable.Map[String, Long] = {
    var words: scala.collection.mutable.Map[String, Long] = new java.util.TreeMap[String, Long]

    while (scanner.hasNext) {
      val word = scanner.next

      words = words + (if (words contains word) word -> (words(word) + 1) else word -> 1)
    }

    words
  }
}

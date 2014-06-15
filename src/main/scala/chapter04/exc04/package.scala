package chapter04

import java.io.File
import java.util.Scanner

import scala.collection.immutable.{Map, TreeMap}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc04 {
  def countWordsMutable(filePath: String): Map[String, Long] = {
    countWordsMutable(new Scanner(new File(filePath)))
  }

  def countWordsMutable(scanner: Scanner): Map[String, Long] = {
    var words = new TreeMap[String, Long]

    while (scanner.hasNext) {
      val word = scanner.next

      words = words + (if (words contains word) word -> (words(word) + 1) else word -> 1)
    }

    words
  }
}

package chapter04

import java.io.File
import java.util.Scanner

import scala.collection.immutable.{HashMap, Map}

/**
 * Repeat the preceding exercise with an immutable map.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc03 {
  def countWordsMutable(filePath: String): Map[String, Long] = {
    countWordsMutable(new Scanner(new File(filePath)))
  }

  def countWordsMutable(scanner: Scanner): Map[String, Long] = {
    var words = new HashMap[String, Long]

    while (scanner.hasNext) {
      val word = scanner.next

      words = words + (if (words contains word) word -> (words(word) + 1) else word -> 1)
    }

    words
  }
}

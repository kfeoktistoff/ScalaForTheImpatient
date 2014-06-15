package chapter04

import java.io.File
import java.util.Scanner

import scala.collection.mutable.{HashMap, Map}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc02 {
  def countWordsMutable(filePath: String): Map[String, Long] = {
    countWordsMutable(new Scanner(new File(filePath)))
  }

  def countWordsMutable(scanner: Scanner): Map[String, Long] = {
    val words = new HashMap[String, Long]

    while (scanner.hasNext) {
      val word = scanner.next

      if (words contains word) {
        words(word) += 1
      } else {
        words(word) = 1
      }
    }

    words
  }
}

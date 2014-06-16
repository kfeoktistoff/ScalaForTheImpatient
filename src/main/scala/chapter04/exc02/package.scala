package chapter04

import java.io.File
import java.util.Scanner

import scala.collection.mutable.{HashMap, Map}

/**
 * Write a program that reads words from a file. Use a mutable map to count
 * how often each word appears. To read the words, simply use java.util.Scanner:
 * val in = new java.util.Scanner(java.io.File("myfile.txt"))
 * while (in.hasNext()) process in.next()
 *
 * Or look at the "Files and Regular Expressions@ chapter for a Scalaesque way.
 * At the end, print out all words and their counts.
 *
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

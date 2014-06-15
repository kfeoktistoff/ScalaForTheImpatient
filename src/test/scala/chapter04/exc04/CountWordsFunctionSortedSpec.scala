package chapter04.exc04

import org.apache.commons.io.IOUtils
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class CountWordsFunctionSortedSpec extends FlatSpec with Matchers {
  "CountWords function" should "count all words in a file in sorted order" in {
    val inputString = "word2 word2 word1 word3 word3 word3"
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner).toList should contain inOrderOnly(("word1", 1), ("word2", 2), ("word3", 3))
  }

  "CountWords function" should "return empty map for empty file" in {
    val inputString = ""
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner) shouldBe empty
  }

  "CountWords function" should "return immutable Map" in {
    val inputString = ""
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner) shouldBe a[scala.collection.immutable.TreeMap[String, Long]]
  }
}
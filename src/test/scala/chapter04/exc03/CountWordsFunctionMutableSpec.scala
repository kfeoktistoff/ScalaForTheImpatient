package chapter04.exc03

import org.apache.commons.io.IOUtils
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class CountWordsFunctionMutableSpec extends FlatSpec with Matchers {
  "CountWords function" should "count all words in a file" in {
    val inputString = "word1 word2 word2 word3 word3 word3"
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner) shouldBe Map(("word1", 1), ("word2", 2), ("word3", 3))
  }

  "CountWords function" should "return empty map for empty file" in {
    val inputString = ""
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner) shouldBe empty
  }

  "CountWords function" should "return immutable Map" in {
    val inputString = ""
    val scanner = new java.util.Scanner(IOUtils.toInputStream(inputString, "UTF-8"))
    countWordsMutable(scanner) shouldBe a[scala.collection.immutable.Map[String, Long]]
  }
}
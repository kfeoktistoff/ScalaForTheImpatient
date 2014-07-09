package chapter13.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class CustomMkStringFunctionSpec extends FlatSpec with Matchers {
  "CustomMkString function spec" should "return the same value as mkString function" in {
    val testCollection: Vector[Int] = Vector[Int](0, 1, 2, 3)
    customMkString(testCollection) shouldBe testCollection.mkString
  }

  "CustomMkString function spec" should "return the same value as mkString(sep:String) function" in {
    val testCollection: Vector[Int] = Vector[Int](0, 1, 2, 3)
    val separator: String = ", "
    customMkString(testCollection, separator) shouldBe testCollection.mkString(sep = separator)
  }

  "CustomMkString function spec" should "return the same value as mkString(start: String, sep: String, end: String) function" in {
    val testCollection: Vector[Int] = Vector[Int](0, 1, 2, 3)
    val separator = ", "
    val start = "before "
    val end = " end"
    customMkString(testCollection, start, separator, end) shouldBe testCollection.mkString(start, sep = separator, end)
  }
}

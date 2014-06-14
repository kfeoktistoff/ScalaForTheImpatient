package chapter03.exc06

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class SortFunctionsSpec extends FlatSpec with Matchers {
  "arrayReverseSort function" should "return the same array with reverse sorted elements" in {
    val array = Array[Int](3, 4, 2, 1, 5, 6)
    arrayReverseSort(array).hashCode() shouldBe array.hashCode()
    arrayReverseSort(array) shouldBe Array(6, 5, 4, 3, 2, 1)
  }

  "arrayBufferReverseSort function" should "return ArrayBuffer reverse sorted elements" in {
    val arrayBuffer = ArrayBuffer[Int](3, 4, 2, 1, 5, 6)
    arrayBufferReverseSort(arrayBuffer) shouldBe Array(6, 5, 4, 3, 2, 1)
  }
}

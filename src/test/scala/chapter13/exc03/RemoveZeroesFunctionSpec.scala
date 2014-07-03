package chapter13.exc03

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 04.07.14
 */

class RemoveZeroesFunctionSpec extends FlatSpec with Matchers {
  "RemoveZeroes function" should "remove zero elements from LinkedList[Int]" in {
    removeZeroes(mutable.LinkedList[Int](0, 1, 3, 0, 5, 0)) shouldBe mutable.LinkedList[Int](1, 3, 5)
  }
}

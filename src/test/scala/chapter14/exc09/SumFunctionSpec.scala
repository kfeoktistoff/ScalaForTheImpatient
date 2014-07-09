package chapter14.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class SumFunctionSpec extends FlatSpec with Matchers {
  "Sum function" should "return sum of all non-empty elements in list" in {
    val list = List[Option[Int]](Option(1), None, Option(5), Option(4), None)
    sum(list) shouldBe 10
  }
}

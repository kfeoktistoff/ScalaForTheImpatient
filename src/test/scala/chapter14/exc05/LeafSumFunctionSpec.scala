package chapter14.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class LeafSumFunctionSpec extends FlatSpec with Matchers {
  "LeafSum function" should "calculate sum of all elements in List[Any]" in {
    leafSum(List[Any](List[Int](3, 8), 2, List[Int](5))) shouldBe 18
  }

  "LeafSum function" should "throw IllegalArgumentException if passed list contains element not Int or List[Int]" in {
    a[IllegalArgumentException] shouldBe thrownBy {
      leafSum(List[Any](List[Int](3, 8), "abc", 2, List[Int](5)))
    }
  }
}

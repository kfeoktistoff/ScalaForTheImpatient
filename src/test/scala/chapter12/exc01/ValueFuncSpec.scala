package chapter12.exc01

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.06.14
 */

class ValueFuncSpec extends FlatSpec with Matchers {
  "Values function" should "return collection of pairs value -> fun(falue)" in {
    values(x => x * x, -5, 5) should contain inOrderOnly(-5 -> 25, -4 -> 16, -3 -> 9, -2 -> 4, -1 -> 1, 0 -> 0,
      1 -> 1, 2 -> 4, 3 -> 9, 4 -> 16, 5 -> 25)
  }
}

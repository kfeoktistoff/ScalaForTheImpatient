package chapter02.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class ProductRecursiveFunctionSpec extends FlatSpec with Matchers {
  "A recursive product function" should "return 9415087488L (\"Hello\" argument is hardcoded)" in {
    product("Hello") shouldBe 9415087488L
  }

  "A recursive product function" should "return 1 if empty string passed" in {
    product("") shouldBe 1
  }
}
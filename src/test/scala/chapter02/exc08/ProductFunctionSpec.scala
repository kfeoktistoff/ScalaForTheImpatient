package chapter02.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class ProductFunctionSpec extends FlatSpec with Matchers {
  "A product function" should "return 9415087488L (\"Hello\" argument is hardcoded)" in {
    product("Hello") shouldBe 9415087488L
  }

  "A product function" should "return 1 if empty string passed" in {
    product("") shouldBe 1
  }
}

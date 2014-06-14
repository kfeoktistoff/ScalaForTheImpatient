package chapter02.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class CharMultiplicationFunctionSpec extends FlatSpec with Matchers {
  "A charMultiplication function" should "return 9415087488L (\"Hello\" argument is hardcoded)" in {
    chapter02.exc06.charMultiplication() shouldBe 9415087488L
  }

  "A charMultiplication cycleless function" should "return 9415087488L (\"Hello\" argument is hardcoded)" in {
    chapter02.exc07.charMultiplication() shouldBe 9415087488L
  }
}

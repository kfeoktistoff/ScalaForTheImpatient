package chapter07.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class PasswordTesterSpec extends FlatSpec with Matchers {
  "isStrongPassword" should "return false if password is not 'secret" in {
    new PasswordTester().isStrongPassword("qwerty".toCharArray) shouldBe false
    new PasswordTester().isStrongPassword("secret".toCharArray) shouldBe true
  }
}

package Chapter7.exc9

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class PasswordTesterSpec extends FlatSpec with Matchers {
  "isStrongPassword" should "return false if password length < 6" in {
    new PasswordTester().isStrongPassword(Array[Char]('1', '2', '3')) shouldBe false
  }

  "isStrongPassword" should "return false if password length = 6" in {
    new PasswordTester().isStrongPassword(Array[Char]('1', '2', '3', '4', '5', '6')) shouldBe true
  }

  "isStrongPassword" should "return false if password length > 6" in {
    new PasswordTester().isStrongPassword(Array[Char]('1', '2', '3', '4', '5', '6', '7')) shouldBe true
  }
}

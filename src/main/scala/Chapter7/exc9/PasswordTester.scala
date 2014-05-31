package Chapter7.exc9

import System._
import System.console
import System.out.{println => info}
import System.err.{println => err}

/**
 * Created by Kirill Feoktistov on 30.05.14
 */

class PasswordTester {
  def testPassword() = {
    val username = getProperty("user.name")
    val password: Array[Char] = console.readPassword()
    if (isStrongPassword(password)) info("Hello, " + username) else err("Weak password!")
  }

  def isStrongPassword(password: Array[Char]) = {
    password.length >= 6
  }
}

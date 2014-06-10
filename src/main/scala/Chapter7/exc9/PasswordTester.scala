package Chapter7.exc9

import System._
import System.console
import System.out.{println => info}
import System.err.{println => err}

/**
 * Write a program that imports the java.lang.System class, reads the user name
 * from the user.name system property, reads a password from the Console object,
 * and prints a message to the standard error stream if the password is not "secret".
 * Otherwise print a greeting to the standard output stream. Do not use aoy other imports,
 * and do not use any qualified names (with dots).
 *
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

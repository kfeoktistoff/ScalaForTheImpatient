package chapter15.exc01

import org.junit.Test

/**
 * Created by Kirill Feoktistov on 08.07.14
 */

class JavaTestAnnotations {
  @Test(expected = classOf[IllegalArgumentException], timeout = 5)
  def jUnitTestWithParameters() {
    println("JUnit test with parameters")
    throw new IllegalArgumentException
  }

  @Test
  def jUnitTest() {
    println("JUnit test withOUT parameters")
  }
}

package chapter09.Exc07

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

class NonRealNumbersPrinterSpec extends FlatSpec with Matchers {
  "A NonRealNumbersPrinter" should "print everything which is not real number" in {
    val testInput = "-1 0.75 10e2 a123 123a\n10e-2"
    val testNonRealNumbersPrinter: TestNonRealNumbersPrinter = new TestNonRealNumbersPrinter()
    testNonRealNumbersPrinter.findAll(testInput)
    testNonRealNumbersPrinter.output should contain inOrderOnly("-1", "0.75", "10e2", "10e-2")
  }
}

class TestNonRealNumbersPrinter extends NonRealNumbersPrinter {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]

  override def print(line: String) {
    output += line
  }
}
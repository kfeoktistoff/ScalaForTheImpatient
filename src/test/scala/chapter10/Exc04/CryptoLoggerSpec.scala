package chapter10.Exc04

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 08.06.14
 */

class CryptoLoggerSpec extends FlatSpec with Matchers {
  "A CryptoLogger" should "use 3 as a default value" in {
    val logger: Object with CryptoLoggerTest = new Object with CryptoLoggerTest
    logger.log("abc")
    logger.output should contain only "def"
  }

  "A CryptoLogger" should "not encrypt symbols not from english alphabet" in {
    val logger: Object with CryptoLoggerTest = new Object with CryptoLoggerTest
    logger.log("a123c")
    logger.output should contain only "d123f"
  }

  "A CryptoLogger" should "save register of plain text" in {
    val logger: Object with CryptoLoggerTest = new Object with CryptoLoggerTest
    logger.log("abc ABC")
    logger.output should contain only "def DEF"
  }

  "A CryptoLogger" should "handle negative offset values" in {
    val logger: Object with CryptoLoggerTest = new Object with CryptoLoggerTest
    logger.offset = -3
    logger.log("abc")
    logger.output should contain only "xyz"
  }
}


trait CryptoLoggerTest extends CryptoLogger {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]

  override def print(line: String) {
    output += line
  }
}
package Chapter9.Exc3

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class LongWordsLoggerSpec extends FlatSpec with Matchers with MockitoSugar {
  "A LongWordsLogger" should "replace tabs with spaces in a file" in {
    val logger: LongWordsLoggerTest = new LongWordsLoggerTest()
    logger.log("babblements " +
      "babysitters " +
      "babysitting " +
      "abbreviators " +
      "abecedarians " +
      "aberrational " +
      "cabinetmakers " +
      "cabinetmaking " +
      "cachinnations ")

    logger.output should contain inOrderOnly("abbreviators", "abecedarians", "aberrational", "cabinetmakers", "cabinetmaking", "cachinnations")
  }
}

class LongWordsLoggerTest extends LongWordsLogger {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]

  override def printInConsole(line: String) = {
    output += line
  }
}
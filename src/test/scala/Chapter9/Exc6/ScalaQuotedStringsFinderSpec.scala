package Chapter9.Exc6

import org.scalatest.{Matchers, FlatSpec}
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 05.06.14
 */

class ScalaQuotedStringsFinderSpec extends FlatSpec with Matchers {
  "A QuotedStringsFinder" should "print all lexemes enclosed with \", \\\" or \\\\\"" in {
    val quotedStringsFinder: TestScalaQuotedStringsFinder = new TestScalaQuotedStringsFinder("someFilePath")
    quotedStringsFinder.findAll("unquoted" +
      "\"" + '\n' +
      "\"\"" + '\n' +
      "\"quoted\"" + '\n' +
      "\\\"slashQuoted\\\"" + '\n' +
      "\\\\\"doubleSlashQuoted\\\\\"" + '\n' +
      "\\\"singleDoubleSlashQuoted\\\\\"" + '\n' +
      "\\\\\"doubleSingleSlashQuoted\\\""
    )
    quotedStringsFinder.output should contain inOrderOnly("\"\"", "\"quoted\"", "\\\"slashQuoted\\\"",
      "\\\\\"doubleSlashQuoted\\\\\"", "\\\"singleDoubleSlashQuoted\\\\\"", "\\\\\"doubleSingleSlashQuoted\\\"")
  }
}

class TestScalaQuotedStringsFinder(inputFilePath: String) extends ScalaQuotedStringsFinder(inputFilePath) {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]()

  override def print(line: String) {
    output += line
  }
}
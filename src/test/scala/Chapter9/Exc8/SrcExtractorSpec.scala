package Chapter9.Exc8

import org.scalatest.{Matchers, FlatSpec}
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

class SrcExtractorSpec extends FlatSpec with Matchers {
  "A SrcExtractor" should "print all unquoted src attributes of img tags" in {
    val test: SrcExtractorTest = new SrcExtractorTest()
    test.extractAllSrc("<img alt=\"Wikidata\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/47px-Wikidata-logo.svg.png\" width=\"47\" height=\"26\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/71px-Wikidata-logo.svg.png 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/94px-Wikidata-logo.svg.png 2x\" data-file-width=\"1052\" data-file-height=\"590\" />")
    test.output should contain only "Wikidata\t//upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Wikidata-logo.svg/47px-Wikidata-logo.svg.png"
  }

  "A SrcExtractor" should "handle spaces between attributes name and value" in {
    val test: SrcExtractorTest = new SrcExtractorTest()
    test.extractAllSrc("<img alt = \"alt\" src =\"image.jpg\">")
    test.output should contain only "alt\timage.jpg"
  }
}

class SrcExtractorTest extends SrcExtractor {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]

  override def print(line: String) {
    output += line
  }
}
package chapter11.exc06

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class ASCIIArtSpec extends FlatSpec with Matchers {
  val rabbit: ArrayBuffer[String] = new ArrayBuffer[String] +=
    "  ^_^  " +=
    "( ' ' )" +=
    "(  -  )" +=
    " | | | " +=
    "(__|__)"

  val bubble: ArrayBuffer[String] = new ArrayBuffer[String] +=
    "   -----  " +=
    " / Hello \\" +=
    "<  Scala |" +=
    " \\ Coder /" +=
    "   -----  "

  "An ASCIIArt" should "add a new line by + operator" in {
    val asciiArt = new ASCIIArt()
    asciiArt += "123"
    asciiArt += "456"

    asciiArt.toString shouldBe "123\n456"
  }

  "An ASCIIArt" should "horizontally merge arts using ++ operator" in {
    val rabbitWithBubble = new ASCIIArt((for (i <- 0 until rabbit.length) yield rabbit(i) + " " + bubble(i)).toBuffer)

    (new ASCIIArt(rabbit) ++ new ASCIIArt(bubble)).toString shouldBe rabbitWithBubble.toString
  }

  "An ASCIIArt" should "throw IllegalArgumentException if lines counts are different" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      val enhancedBubble = new ASCIIArt(bubble) += "<bottom line of buble>"
      new ASCIIArt(rabbit) ++ enhancedBubble
    }
  }

  "An ASCIIArt" should "vertically merge arts using ^^ operator" in {
    var asString = ""

    for (line <- rabbit ++ bubble) {
      asString += line + "\n"
    }

    asString = asString.dropRight(1)

    (new ASCIIArt(rabbit) ^^ new ASCIIArt(bubble)).toString shouldBe asString
  }
}
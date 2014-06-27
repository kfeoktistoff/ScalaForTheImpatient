package chapter11.exc06

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class ASCIIArt(var content: mutable.Buffer[String] = new ArrayBuffer[String]) {

  def +=(line: String) = {
    content += line
    this
  }

  /**
   * Horizontal concatenation
   */
  def ++(other: ASCIIArt) = {
    if (other.content.length != content.length) throw new IllegalArgumentException("Arts have different count of lines")

    val concatenatedBuffer = (for (line <- 0 until other.content.length) yield content(line) + " " + other.content(line)).toBuffer
    new ASCIIArt(concatenatedBuffer)
  }

  /**
   * Vertical concatenation
   */
  def ^^(other: ASCIIArt) = {
    new ASCIIArt(content ++ other.content)
  }

  def print() {
    for (line <- content) {
      print(line)
    }
  }

  def print(line: String) {
    println(line)
  }

  override def toString = {
    var asString = ""
    for (line <- content) asString += line + "\n"
    asString.dropRight(1)
  }
}

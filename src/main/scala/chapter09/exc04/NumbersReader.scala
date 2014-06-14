package chapter09.exc04

import java.io.{BufferedInputStream, File, FileInputStream, InputStream}
import java.util.Scanner

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class NumbersReader {
  def this(file: File = new File("src/main/resources/Chapter9/Exc4/FileWithRealNumbers.txt")) = {
    this()
    readNumbersFromFile(file)
  }

  val maxFileSize: Int = 1024

  val numbers: ArrayBuffer[BigDecimal] = new ArrayBuffer[BigDecimal]

  def readNumbersFromFile(file: File) {
    if (file.length() > maxFileSize) throw new IllegalArgumentException("File is too big")
    readNumbersFromFile(new BufferedInputStream(new FileInputStream(file)))
  }

  def readNumbersFromFile(inputStream: InputStream) {
    val scanner: Scanner = new Scanner(inputStream)

    while (scanner.hasNext) {
      val next: String = scanner.next()
      if (isNumber(next)) {
        numbers += next.toDouble
      }
    }
  }

  private def isNumber(possibleNumber: String) = {
    try {
      possibleNumber.toDouble
    } catch {
      case e: Exception => false
    }

    true
  }

  def min() = {
    numbers.min
  }

  def max() = {
    numbers.max
  }

  def sum() = {
    numbers.sum
  }

  def avg() = {
    sum() / numbers.size
  }
}

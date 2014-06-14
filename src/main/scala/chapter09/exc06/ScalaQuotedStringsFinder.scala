package chapter09.exc06

import scala.io.Source

/**
 * Created by Kirill Feoktistov on 05.06.14
 */

class ScalaQuotedStringsFinder(inputFilePath: String = "src/main/resources/Chapter9/Exc6/FileWithQuotedStrings.txt") {
  val quotedStringRegex = """\\{0,2}".*?"""".r

  def findAll(): Unit = {
    findAll(Source.fromFile(inputFilePath).mkString)
  }

  def findAll(fileContent: String) {
    for (i <- quotedStringRegex.findAllIn(fileContent)) {
      print(i)
    }
  }

  def print(line: String) {
    println(line)
  }
}

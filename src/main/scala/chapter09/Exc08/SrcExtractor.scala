package chapter09.Exc08

import scala.io.Source

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

class SrcExtractor(inputFilePath: String = "src/main/resources/Chapter9/Exc8/FileWithImgTags.txt") {
  def extractAllSrc(): Unit = {
    extractAllSrc(Source.fromFile(inputFilePath).mkString)
  }

  def extractAllSrc(fileContent: String) = {
    val altAndSrc = """(alt.*?".*?") (src.*?".*?")""".r

    for (altAndSrc(alt, src) <- altAndSrc.findAllIn(fileContent)) {
      print(unQuote(alt) + '\t' + unQuote(src))
    }
  }

  def unQuote(lexeme: String) = {
    val quoted = """(?<=").*?(?=")""".r
    quoted.findFirstIn(lexeme).get
  }

  def print(line: String) {
    println(line)
  }
}

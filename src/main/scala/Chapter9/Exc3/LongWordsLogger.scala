package Chapter9.Exc3

import scala.io.Source
import java.io.File

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class LongWordsLogger {
  val path = "src/main/resources/Chapter9/Exc3/FileWithWords.txt"
  val loggedWordLength = 12
  val wordsSplitRegex: String = "\\s+"

  def log(file: File = new File(path)):Unit = {
    log(Source.fromFile(file).mkString)
  }

  def log(fileContent: String):Unit = {
    for (i <- fileContent.split(wordsSplitRegex) if i.length >= loggedWordLength) printInConsole(i)
  }

  def printInConsole(line: String) {
    println(line)
  }

  /**
   * One-line solution
   */
  def log():Unit = {
    for (i <- Source.fromFile(path).mkString.split(wordsSplitRegex) if i.length >= loggedWordLength) println(i)
  }
}

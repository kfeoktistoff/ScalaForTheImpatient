package Chapter9.Exc3

import scala.io.Source
import java.io.PrintWriter

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class LongWordsLogger {
  val path = "src/main/resources/Chapter9/Exc3/FileWithWords.txt"
  val loggedWordLength = 12
  val wordsSplitRegex: String = "\\s+"

  def log(filePath: String): Unit = {
    log(Source.fromFile(filePath).mkString, new PrintWriter(filePath))
  }

  def log(fileContent: String, writer: PrintWriter) = {
    for (i <- fileContent.split(wordsSplitRegex) if i.length >= loggedWordLength) writer.println(i)
  }

  /**
   * One-line solution
   */
  def log() = {
    for (i <- Source.fromFile(path).mkString.split(wordsSplitRegex) if i.length >= loggedWordLength) println(i)
  }
}

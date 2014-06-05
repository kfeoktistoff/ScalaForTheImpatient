package Chapter9.Exc7

import scala.io.Source

/**
 * Created by Kirill Feoktistov on 06.06.14
 */

class NonRealNumbersPrinter(inputFilePath: String = "src/main/resources/Chapter9/Exc7/FileWithRealNumbers.txt") {
  val nonRealNumberRegex = """(?<=^|(\s+)|\n)[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?(?=(\s+)|$|\n)""".r

  def findAll() {
    findAll(Source.fromFile(inputFilePath).mkString)
  }

  def findAll(fileContent: String) {
    for (i <- nonRealNumberRegex.findAllIn(fileContent)) {
      print(i)
    }
  }

  def print(line: String) {
    println(line)
  }
}

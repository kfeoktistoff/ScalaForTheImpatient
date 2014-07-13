package chapter15.exc05

import scala.io.Source

/**
 * Created by Kirill Feoktistov on 13.07.14
 */

class FileContent {
  def read(filePath: String) = {
    Source.fromFile(filePath).mkString
  }
}

package chapter09.Exc01

import java.io.PrintWriter

import scala.io.Source

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class FileReverser {
  def reverseFile(): Unit = {
    val path: String = "src/main/resources/Chapter9/Exc1/FileToReverse.txt"
    reverseFile(Source.fromFile(path).getLines().toArray, new PrintWriter(path))
  }

  def reverseFile(fileContent: Array[String], writer: PrintWriter): Unit = {
    for (i <- fileContent.reverse) {
      writer.println(i)
    }

    writer.flush()
  }
}

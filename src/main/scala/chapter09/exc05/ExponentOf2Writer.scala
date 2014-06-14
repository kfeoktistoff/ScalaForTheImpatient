package chapter09.exc05

import java.io.PrintWriter

/**
 * Created by Kirill Feoktistov on 05.06.14
 */

class ExponentOf2Writer(outputFilePath: String) {
  val powerMax: Int = 20

  def print(): Unit = {
    print(new PrintWriter(outputFilePath))
  }

  def print(writer: PrintWriter) = {
    for (i <- 0 to powerMax) {
      writer.println(Integer.toString(i) + '\t' + Math.pow(Math.pow(2, i), -1))
    }
    writer.flush()
  }
}

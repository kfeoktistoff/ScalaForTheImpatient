package Chapter9.Exc2

import scala.io.Source
import java.io.PrintWriter

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class TabsRelacer {
  def replaceTabs() {
    val path: String = "src/main/resources/Chapter9/Exc2/FileWithTabs.txt"
    replaceTabs(Source.fromFile(path).getLines().toArray, new PrintWriter(path))
  }

  def replaceTabs(input: Array[String], writer: PrintWriter) {
    for (i <- input) {
      writer.println(i.replace('\t', ' '))
    }

    writer.flush()
  }
}

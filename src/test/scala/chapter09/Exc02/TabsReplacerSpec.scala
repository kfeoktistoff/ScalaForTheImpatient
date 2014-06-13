package chapter09.Exc02

import chapter09.OutputLinesAccumulator
import org.mockito.Matchers.any
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class TabsReplacerSpec extends FlatSpec with Matchers with MockitoSugar {
  "A TabsReplacer" should "replace tabs with spaces in a file" in {
    val writer = mock[java.io.PrintWriter]

    val output: OutputLinesAccumulator = new OutputLinesAccumulator

    doAnswer(output).when(writer).println(any[String])

    new TabsRelacer().replaceTabs(Array("|\t|\t|\t|", "|_ |_ |_ |"), writer)
    output.output should contain inOrderOnly("| | | |", "|_ |_ |_ |")
    verify(writer).flush()
  }
}

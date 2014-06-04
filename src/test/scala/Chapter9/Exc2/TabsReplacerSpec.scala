package Chapter9.Exc2

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.mockito.Matchers.any
import Chapter9.OutputLinesAccumulator

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

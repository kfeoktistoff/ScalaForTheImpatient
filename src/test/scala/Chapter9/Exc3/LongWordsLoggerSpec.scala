package Chapter9.Exc3

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar
import org.mockito.Mockito._
import org.mockito.Matchers._
import Chapter9.OutputLinesAccumulator

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class LongWordsLoggerSpec extends FlatSpec with Matchers with MockitoSugar {
  "A LongWordsLogger" should "replace tabs with spaces in a file" in {
    val writer = mock[java.io.PrintWriter]

    val output: OutputLinesAccumulator = new OutputLinesAccumulator

    doAnswer(output).when(writer).println(any[String])

    new LongWordsLogger().log("babblements " +
      "babysitters " +
      "babysitting " +
      "abbreviators " +
      "abecedarians " +
      "aberrational " +
      "cabinetmakers " +
      "cabinetmaking " +
      "cachinnations ", writer)
    output.output should contain inOrderOnly("abbreviators", "abecedarians", "aberrational", "cabinetmakers", "cabinetmaking", "cachinnations")
  }
}

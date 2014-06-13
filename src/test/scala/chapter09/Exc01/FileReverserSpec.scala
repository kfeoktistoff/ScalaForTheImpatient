package chapter09.Exc01

import chapter09.OutputLinesAccumulator
import org.mockito.Matchers.any
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class FileReverserSpec extends FlatSpec with Matchers with MockitoSugar {
  "A FileReverser" should "write file content in reverse order" in {
    val writer = mock[java.io.PrintWriter]

    val output: OutputLinesAccumulator = new OutputLinesAccumulator
    doAnswer(output).when(writer).println(any[String])

    new FileReverser().reverseFile(Array("1", "2", "3"), writer)

    output.output should contain inOrderOnly("3", "2", "1")
    verify(writer).flush()
  }
}

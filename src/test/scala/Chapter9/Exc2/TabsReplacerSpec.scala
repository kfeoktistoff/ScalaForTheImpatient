package Chapter9.Exc2

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar
import scala.collection.mutable.ArrayBuffer
import org.mockito.Mockito._
import org.mockito.Matchers.any
import org.mockito.stubbing.Answer
import org.mockito.invocation.InvocationOnMock

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class TabsReplacerSpec extends FlatSpec with Matchers with MockitoSugar {
  "A TabsReplacer" should "replace tabs with spaces in a file" in {
    val writer = mock[java.io.PrintWriter]

    val output: ArrayBuffer[String] = new ArrayBuffer[String]

    doAnswer(new Answer[Object] {
      override def answer(invocation: InvocationOnMock): Object = {
        output += invocation.getArguments()(0).asInstanceOf[String]
        null
      }
    }).when(writer).println(any[String])

    new TabsRelacer().replaceTabs(Array("|\t|\t|\t|", "|_ |_ |_ |"), writer)
    output should contain inOrderOnly("| | | |", "|_ |_ |_ |")
    verify(writer).flush()
  }
}

package Chapter9

import org.mockito.stubbing.Answer
import org.mockito.invocation.InvocationOnMock
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 04.06.14
 */

class OutputLinesAccumulator extends Answer[Object] {
  val output: ArrayBuffer[String] = new ArrayBuffer[String]

  override def answer(invocation: InvocationOnMock): Object = {
    output += invocation.getArguments()(0).asInstanceOf[String]
    null
  }
}

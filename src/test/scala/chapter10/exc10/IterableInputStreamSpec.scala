package chapter10.exc10

import java.io.ByteArrayInputStream

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class IterableInputStreamSpec extends FlatSpec with Matchers {
  "An IterableInputStream" should "" in {
    val testInput = "Hello".getBytes("UTF-8")

    val stream = new ByteArrayInputStream(testInput) with IterableInputStream {
      override def iterator: Iterator[Byte] = buf.iterator
    }

    var readByte = stream.read()
    var index = 0

    while (readByte != -1) {
      readByte shouldBe testInput(index)
      readByte = stream.read()
      index += 1
    }
  }
}

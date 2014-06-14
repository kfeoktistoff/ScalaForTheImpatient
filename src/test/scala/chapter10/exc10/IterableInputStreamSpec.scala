package chapter10.exc10

import java.io.ByteArrayInputStream

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class IterableInputStreamSpec extends FlatSpec with Matchers {
  "An IterableInputStream" should "return input byte-by-byte after read method calling" in {
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

  "An IterableInputStream" should "return -1 when end of input reached" in {
    val testInput = "".getBytes("UTF-8")

    val stream = new ByteArrayInputStream(testInput) with IterableInputStream {
      override def iterator: Iterator[Byte] = buf.iterator
    }

    stream.read() shouldBe -1
  }
}

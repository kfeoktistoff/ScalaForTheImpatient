package chapter10.exc08

import java.io
import java.nio.charset.Charset

import chapter10.TestStreamReader
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class BufferedInputStreamSpec extends FlatSpec with Matchers {
  "A BufferedInputStream trait" should "work as well as BufferedInputStream decorator" in {
    val line: String = "Hello, World!"
    val streamWithTrait = new java.io.ByteArrayInputStream(line.getBytes(Charset.forName("UTF-8"))) with BufferedInputStream
    val fromTrait = new TestStreamReader().read(streamWithTrait)

    val decoratedStream = new io.BufferedInputStream(new java.io.ByteArrayInputStream(line.getBytes(Charset.forName("UTF-8"))))
    val fromDecorated = new TestStreamReader().read(decoratedStream)

    fromTrait shouldBe fromDecorated

    streamWithTrait.close()
    decoratedStream.close()
  }
}

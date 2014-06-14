package chapter10.exc09

import java.io.StringBufferInputStream

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class BufferedInputStreamSpec extends FlatSpec with Matchers {
  "A BufferedInputStream" should "log buffers" in {
    val testInput: String = "Hello, world!"
    val stream = new StringBufferInputStream(testInput) with TestLogger with BufferedInputStream
    stream.read()
    stream.output should contain only testInput
    stream.close()
  }
}

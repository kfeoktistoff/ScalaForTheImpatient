package chapter10

import java.io.InputStream

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class TestStreamReader {
  def read(stream: InputStream) {
    var content: String = ""
    var data = -1

    do {
      data = stream.read()
      content += data.toChar
    } while (data > 0)

    content
  }
}

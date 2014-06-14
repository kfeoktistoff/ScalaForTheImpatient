package chapter10.exc08

import java.io.InputStream

/**
 * Created by Kirill Feoktistov on 13.06.14
 */

trait BufferedInputStream {
  this: InputStream =>
  val bufferedInputStream = new java.io.BufferedInputStream(this)

  override def read(): Int = {
    bufferedInputStream.read()
  }
}
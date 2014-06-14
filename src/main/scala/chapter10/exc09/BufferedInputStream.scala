package chapter10.exc09

import java.io.InputStream

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

trait BufferedInputStream extends Logged {
  this: InputStream =>

  val bufferedInputStream: java.io.BufferedInputStream = new java.io.BufferedInputStream(this) {
    override def read(): Int = {
      val n = super.read()
      log(new String(buf).replaceAll("\u0000", ""))
      n
    }
  }

  override def read() = {
    bufferedInputStream.read()
  }
}

trait Logged {
  def log(msg: String) {}
}

trait TestLogger extends Logged {
  val output = new ArrayBuffer[String]

  override def log(msg: String) {
    output += msg
  }
}
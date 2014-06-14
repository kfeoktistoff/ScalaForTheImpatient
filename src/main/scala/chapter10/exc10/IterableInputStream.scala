package chapter10.exc10

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

trait IterableInputStream extends java.io.InputStream with Iterable[Byte] {
  val byteIterator = iterator

  override def read(): Int = {
    if (!byteIterator.hasNext)
      -1
    else
      byteIterator.next()
  }

  override def iterator: Iterator[Byte] = ???
}

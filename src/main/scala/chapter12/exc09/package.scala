package chapter12

import scala.collection.GenSeq

/**
 * Implement corresponds without currying. Then try the call from the preceding exercise. What problem do you encounter?
 *
 * Created by Kirill Feoktistov on 29.06.14
 */

package object exc09 {
  def correspondsWithoutCurrying[A, B](p: (A, B) => Boolean, first: GenSeq[A], second: GenSeq[B]): Boolean = {
    val i = first.iterator
    val j = second.iterator
    while (i.hasNext && j.hasNext)
      if (!p(i.next(), j.next()))
        return false

    !i.hasNext && !j.hasNext
  }
}

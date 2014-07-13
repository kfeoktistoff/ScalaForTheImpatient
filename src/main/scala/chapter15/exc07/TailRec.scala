package chapter15.exc07

import scala.annotation.tailrec

/**
 * Created by Kirill Feoktistov on 13.07.14
 */

class TailRec {
  @tailrec
  private def sum(xs: Seq[Int], partial: BigInt): BigInt = if (xs.isEmpty) partial else sum(xs.tail, xs.head + partial)

  @tailrec
  final def sum2(xs: Seq[Int], partial: BigInt): BigInt = if (xs.isEmpty) partial else sum2(xs.tail, xs.head + partial)

  //  @tailrec  //Will be error if uncomment
  def sum3(xs: Seq[Int], partial: BigInt): BigInt = if (xs.isEmpty) partial else sum3(xs.tail, xs.head + partial)
}

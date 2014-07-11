package chapter15.exc04

import scala.annotation.varargs

/**
 * Created by Kirill Feoktistov on 11.07.14
 */

class Accumulator {
  @varargs def sum(appends: Int*) = {
    appends.sum
  }
}

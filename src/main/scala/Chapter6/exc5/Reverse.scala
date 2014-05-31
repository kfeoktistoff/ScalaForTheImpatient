package Chapter6.exc5

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object Reverse extends App {
  reverseArray(args)

  def reverseArray(array: Array[String]): String = {
    if (array == null) return ""

    var reversedArrayAsString = ""

    for (i <- array.reverse) {
      reversedArrayAsString += i
      reversedArrayAsString += ' '
    }

    reversedArrayAsString.dropRight(1)
  }
}

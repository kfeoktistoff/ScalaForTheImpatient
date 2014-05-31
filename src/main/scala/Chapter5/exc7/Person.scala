package Chapter5.exc7

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class Person(fullName: String) {
  if (fullName.count(_ == ' ') != 1) throw new IllegalArgumentException
  val firstName: String = fullName.split(' ')(0)
  val lastName: String = fullName.split(' ')(1)
}

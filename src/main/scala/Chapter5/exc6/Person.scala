package Chapter5.exc6

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class Person(var name: String, var age: Int) {
  if (age < 0) this.age = 0
}

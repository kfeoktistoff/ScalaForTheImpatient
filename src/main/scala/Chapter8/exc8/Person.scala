package Chapter8.exc8

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

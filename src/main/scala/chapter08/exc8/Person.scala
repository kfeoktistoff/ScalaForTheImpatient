package chapter08.exc8

/**
 * Compile the Person and SecretAgent classes in Section 6 and analyze
 * the class files with javap. How many name fields are there? How many
 * name getter methods are there? What do they get? (Hint: Use the -c and -private options.)
 *
 * Created by Kirill Feoktistov on 31.05.14
 */

class Person(val name: String) {
  override def toString = getClass.getName + "[name=" + name + "]"
}

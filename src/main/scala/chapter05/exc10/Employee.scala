package chapter05.exc10

/**
 * Consider the class
 *
 * class Employee(val name: String, val salary: Double) {
 * def this() { this("John Q. Public", 0.0) }
 * }
 *
 * Rewrite it to use explicit fields and a default primary constructor.
 * Which form do you prefer? Why?
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

class Employee(private val nameArg: String = "John Q. Public", private val salaryArg: Double = 0.0) {
  val name = nameArg
  val salary = salaryArg
}

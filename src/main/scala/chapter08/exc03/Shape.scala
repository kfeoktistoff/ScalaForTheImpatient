package chapter08.exc03

/**
 * Consult your favorite Java or C++ textbook that is sure to have an example
 * of a toy inheritance hierarchy, perhaps involving employees, pets, graphical shapes,
 * or hte like. Implement the example in Scala.
 *
 * Created by Kirill Feoktistov on 31.05.14
 */

abstract class Shape {
  def perimeter(): Double

  def square(): Double
}

package chapter08.exc06

import chapter08.exc05.Point

/**
 * Define an abstract class Shape with an abstract method centerPoint
 * and subclasses Rectangle and Circle. Provide appropriate constructor
 * for the subclasses and override the centerPoint method in each subclass.
 *
 * Created by Kirill Feoktistov on 31.05.14
 */

abstract class Shape {
  def centerPoint(): Point
}

package chapter08.exc06

import chapter08.exc05.Point

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Circle(val centerX: Double, val centerY: Double, val radius: Double) extends Shape {
  if (radius < 0) throw new IllegalArgumentException("Radius should be >=0")

  override def centerPoint(): Point = new Point(centerX, centerY)
}

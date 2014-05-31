package Chapter8.exc6

import Chapter8.exc5.Point

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Circle(val centerX: Double, val centerY: Double, val radius: Double) extends Shape {
  if (radius < 0) throw new IllegalArgumentException("Radius should be >=0")

  override def centerPoint(): Point = new Point(centerX, centerY)
}

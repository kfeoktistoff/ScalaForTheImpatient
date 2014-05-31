package Chapter8.exc6

import Chapter8.exc5.Point

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Rectangle(val bottomLeftCorner: Point, val a: Double, val b: Double) extends Shape {
  if (a < 0 || b < 0) throw new IllegalArgumentException("Rectangle sides should be >= 0")

  override def centerPoint(): Point = new Point(bottomLeftCorner.x + a / 2, bottomLeftCorner.y + b / 2)
}

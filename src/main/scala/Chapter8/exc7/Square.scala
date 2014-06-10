package Chapter8.exc7

import Chapter8.exc5.Point

/**
 * Provide a class Square that extends java.awt.Rectangle and
 * has three constructors, one that constructs a square with a given
 * corner point and width, one that constructs a square with corner (0, 0)
 * and given width, and one that constructs a square with corner (0, 0) and width 0.
 *
 * Created by Kirill Feoktistov on 31.05.14
 */

class Square(bottomLeftCorner: Point = new Point(0, 0), side: Int = 0) extends java.awt.Rectangle(bottomLeftCorner.x.toInt, bottomLeftCorner.y.toInt, side, side) {
  if (side < 0) throw new IllegalArgumentException("Side should be >=0")

  def this(side: Int) = {
    this(new Point(0, 0), side)
  }

  def this(bottomLeftCorner: Point) = {
    this(bottomLeftCorner, 0)
  }
}

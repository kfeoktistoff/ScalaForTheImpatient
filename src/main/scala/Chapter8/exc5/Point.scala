package Chapter8.exc5

/**
 * Design a class Point whose x- and y-coordinate values can be provided in a constructor.
 * Provide a subclass LabeledPoint whose constructor takes a label value and x- and y-coordinates,
 * such as
 *
 *  new LaveledPoint("Black Thursday", 1929, 230.07)
 *
 * Created by Kirill Feoktistov on 31.05.14
 */

class Point(val x: Double, val y: Double) {
  override def equals(that: Any): Boolean = {
    that.isInstanceOf[Point] && x == that.asInstanceOf[Point].x && y == that.asInstanceOf[Point].y
  }

  override def hashCode() = {
    29 * x.hashCode() + 31 * y.hashCode()
  }
}

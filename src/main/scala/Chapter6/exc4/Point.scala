package Chapter6.exc4

/**
 * Define a Point class with a companion object so that you can construct Point
 * instances as Point(3, 4), without using new.
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

class Point(var x: Double, var y: Double) {

}

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
}
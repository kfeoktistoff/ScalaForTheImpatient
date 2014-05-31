package Chapter6.exc4

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class Point(var x: Double, var y: Double) {

}

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
}
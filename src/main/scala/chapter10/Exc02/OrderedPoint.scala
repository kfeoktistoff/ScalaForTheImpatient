package chapter10.Exc02

import java.awt.Point

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
  override def compare(that: Point): Int = {
    if (this.x.compareTo(that.x) == 0) this.y.compareTo(that.y) else this.x.compareTo(that.x)
  }
}

package chapter14

/**
 * Write a function that composes two functions of type Double => Option[Double], yielding another function of
 * the same type. The composition should yield None if either function does. For example,
 *  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
 *  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
 *  val h = compose(f, g)
 *
 * Then h(2) is Some(1), and h(1) and h(0) are None.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc10 {
  def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
    composePartial(convertToPartial(f), convertToPartial(g)).lift
  }

  def convertToPartial(f: (Double) => Option[Double]): PartialFunction[Double, Double] =
    new PartialFunction[Double, Double] {
      def isDefinedAt(x: Double): Boolean = f(x).isDefined

      def apply(x: Double): Double = f(x).get
    }

  def composePartial(f: PartialFunction[Double, Double],
                     g: PartialFunction[Double, Double]) = new PartialFunction[Double, Double] {
    def isDefinedAt(x: Double) = g.isDefinedAt(x) && f.isDefinedAt(g(x))

    def apply(x: Double) = f(g(x))
  }
}
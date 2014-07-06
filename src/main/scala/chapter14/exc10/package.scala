package chapter14

/**
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
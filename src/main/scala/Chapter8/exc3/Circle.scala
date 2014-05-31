package Chapter8.exc3

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Circle(radius: Double) extends Shape {

  override def perimeter(): Double = {
    throw new UnsupportedOperationException
  }

  override def square(): Double = Math.PI * Math.pow(radius, 2)
}

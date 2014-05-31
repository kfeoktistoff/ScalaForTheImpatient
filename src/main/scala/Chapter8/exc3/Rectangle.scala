package Chapter8.exc3

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Rectangle(a: Double, b: Double) extends Shape {
  override def perimeter(): Double = 2 * a + 2 * b

  override def square(): Double = a * b
}

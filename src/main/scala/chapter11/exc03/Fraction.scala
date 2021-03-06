package chapter11.exc03

/**
 * Implement the Fraction class with operations + - * /. Normalize fractions, for example turning 15/-6 into -5/2.
 * Divide by the greatest common divisor, like this:
 *  class Fraction(n: Int, d: Int) {
 *   private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
 *   private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
 *   override def toString = num + "/" + den
 *   def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
 *   def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
 *   ...
 * }
 *
 * Created by Kirill Feoktistov on 17.06.14
 */

class Fraction(n: Int, d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  override def toString = num + "/" + den

  override def equals(other: Any) = other.isInstanceOf[Fraction] && other.asInstanceOf[Fraction].num == num && other.asInstanceOf[Fraction].den == den

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

  def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

  def abs(a: Int): Int = math.abs(a)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)

  def /(other: Fraction) = new Fraction(num / other.num, den / other.den)

  def +(other: Fraction) = new Fraction(num * other.den + other.num * den, den * other.den)

  def -(other: Fraction) = new Fraction(num * other.den - other.num * den, den * other.den)
}

package chapter11.exc04

/**
 *
 * Operators * and / make sense if the second argument is number value.
 * Money * number can be used for calculation total price of several units.
 * Money / number can be used for calculation price per unit.
 *
 * Created by Kirill Feoktistov on 18.06.14
 */

class Money(val dollars: Int, val cents: Int) {
  override def equals(other: Any) = other.isInstanceOf[Money] && other.asInstanceOf[Money].dollars == dollars &&
    other.asInstanceOf[Money].cents == cents

  override def toString: String = {
    val normalizedMoney = toMoney(toCents(this))
    (if (math.signum(math.min(dollars, cents)) < 0) "-" else "") +
      "$" + math.abs(normalizedMoney.dollars) + "." + math.abs(normalizedMoney.cents)
  }

  private def toCents(money: Money) = money.cents + 100 * money.dollars

  private def toMoney(cents: Int) = new Money(cents / 100, cents % 100)

  def +(other: Money) = toMoney(toCents(this) + toCents(other))

  def -(other: Money) = toMoney(toCents(this) - toCents(other))

  def <(other: Money) = toCents(this) < toCents(other)
}

object Money {
  def apply(dollars: Int, cents: Int) = new Money(dollars, cents)
}
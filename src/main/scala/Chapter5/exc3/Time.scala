package Chapter7.exc3

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class Time {
  def this(hrs: Int, min: Int) {
    this()
    if (hrs >= 24 || hrs < 0 || min >= 60 || min < 0) throw new IllegalArgumentException
    this.hrs = hrs
    this.min = min
  }

  private var hrs: Int = _
  private var min: Int = _

  def hours = hrs

  def minutes = min

  def before(other: Time): Boolean = other.hours > hours || other.minutes > minutes
}

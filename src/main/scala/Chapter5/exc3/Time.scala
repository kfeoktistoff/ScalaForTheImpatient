package Chapter7.exc3

/**
 * Write a class Time with read-only properties hours and minutes and a method before(other: Time): Boolean
 * that checks whether this time comes before the other. A Time object should be constructed as
 * new Time(hrs, min), where hrs is in military time (between 0 and 23)
 *
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

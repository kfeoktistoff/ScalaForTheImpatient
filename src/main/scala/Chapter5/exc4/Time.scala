package Chapter5.exc4

/**
 * Reimplement the Time class from the preceding exercise so that the internal
 * representation is the number of minutes since midnight (between 0 and 24*60-1).
 * Do not change the public interface. That is, client code should be unaffected by your change.
 *
 * Created by Kirill Feoktistov on 27.05.14
 */

class Time {
  def this(hrs: Int, min: Int) {
    this()
    if (hrs >= 24 || hrs < 0 || min >= 60 || min < 0) throw new IllegalArgumentException
    this.minCount = hrs * 60 + min
  }

  private var minCount: Int = _

  def hours = minCount / 60

  def minutes = minCount % 60

  def before(other: Time): Boolean = other.hours > hours || other.minutes > minutes
}

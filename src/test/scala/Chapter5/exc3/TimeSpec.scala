package Chapter5.exc3

import Chapter7.exc3.Time
import org.scalatest._

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class TimeSpec extends FlatSpec with Matchers {
  "A Time" should "throw IllegalArgumentException if hours = 24" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(24, 30)
    }
  }

  "A Time" should "throw IllegalArgumentException if hours > 24" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(25, 30)
    }
  }

  "A Time" should "throw IllegalArgumentException if hours < 0" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(-1, 30)
    }
  }

  "A Time" should "throw IllegalArgumentException if minutes = 60" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(12, 60)
    }
  }

  "A Time" should "throw IllegalArgumentException if minutes > 60" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(12, 61)
    }
  }

  "A Time" should "throw IllegalArgumentException if minutes < 0" in {
    a[IllegalArgumentException] should be thrownBy {
      new Time(12, -1)
    }
  }

  "A Time" should "be successfully created if hours or minutes is 0" in {
    new Time(0, 0)
  }

  "A Time" should "return true after call before(other: Time) if other.hours > this.hours" in {
    new Time(5, 0) before new Time(6, 0) shouldBe true
  }

  "A Time" should "return true after call before(other: Time) if other.hours = this.hours and other.minutes > this.minutes" in {
    new Time(5, 0) before new Time(5, 10) shouldBe true
  }

  "A Time" should "return false after call before(other: Time) if their hours and minutes are equal" in {
    new Time(5, 0) before new Time(5, 0) should not be true
  }

  "A Time" should "return hours when call hours()" in {
    new Time(5, 10).hours shouldBe 5
  }

  "A Time" should "return minutes when call minutes()" in {
    new Time(5, 10).minutes shouldBe 10
  }
}

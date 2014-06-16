package chapter04.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 16.06.14
 */

class WeekDaysSpec extends FlatSpec with Matchers {
  "WeekDay map" should "contain elements in adding order" in {
    weekDays.keySet.toArray shouldBe Array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
  }
}

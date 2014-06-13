package chapter05.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class PersonSpec extends FlatSpec with Matchers {
  "A Person" should "set age as 0 if age < 0" in {
    new Person("Fred", -25).age shouldBe 0
  }

  "A Person" should "set age if argument > 0" in {
    new Person("Fred", 25).age shouldBe 25
  }

  "A Person" should "set age if argument == 0" in {
    new Person("Fred", 0).age shouldBe 0
  }
}

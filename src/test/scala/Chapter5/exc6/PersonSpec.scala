package Chapter5.exc6

import org.scalatest.{Matchers, FlatSpec}

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

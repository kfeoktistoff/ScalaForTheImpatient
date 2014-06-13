package chapter05.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class PersonSpec extends FlatSpec with Matchers {
  "A Person" should "use full name as argument" in {
    new Person("Fred Smith")
  }

  "A Person" should "throw IllegalArgumentException if no space between first and last names in fullname" in {
    a[IllegalArgumentException] should be thrownBy {
      new Person("Fred")
    }
  }

  "A Person" should "throw IllegalArgumentException more than one space in fullname" in {
    a[IllegalArgumentException] should be thrownBy {
      new Person("Fred Smith Doe")
    }
  }

  "A Person" should "provide first name for reading" in {
    new Person("Fred Smith").firstName shouldBe "Fred"
  }

  "A Person" should "provide last name for reading" in {
    new Person("Fred Smith").lastName shouldBe "Smith"
  }
}

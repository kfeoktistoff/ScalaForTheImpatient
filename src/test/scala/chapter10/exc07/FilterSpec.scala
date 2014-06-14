package chapter10.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

class FilterSpec extends FlatSpec with Matchers {
  "An EvenFilter" should "filter odd values only" in {
    val filter = new Object with EvenFilter
    filter.filter(Array[Int](0, 1, 2, 3, 4, 5, 6)) shouldBe Array(1, 3, 5)
  }

  "An PrimeFilter" should "filter prime values only" in {
    val filter = new Object with PrimeFilter
    filter.filter(Array[Int](0, 1, 2, 3, 4, 5, 6)) shouldBe Array(2, 3, 5)
  }

  "An PrimeFilter after EvenFilter" should "not remove 2 (as far as 2 is a prime number)" in {
    val filter = new Object with EvenFilter with PrimeFilter
    filter.filter(Array[Int](0, 1, 2, 3, 4, 5, 6)) shouldBe Array(2, 3, 5)
  }

  "An PrimeFilter before EvenFilter" should "remove 2 (as far as 2 is an odd number)" in {
    val filter = new Object with PrimeFilter with EvenFilter
    filter.filter(Array[Int](0, 1, 2, 3, 4, 5, 6)) shouldBe Array(1, 3, 5)
  }
}

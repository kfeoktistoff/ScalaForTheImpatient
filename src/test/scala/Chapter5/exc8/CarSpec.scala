package Chapter5.exc8

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class CarSpec extends FlatSpec with Matchers {
  "A Car" should "return year" in {
    new Car(creator = "Honda", model = "Accord", year = 2014).year shouldBe 2014
  }

  "A Car" should "return vin" in {
    new Car(creator = "Honda", model = "Accord", vin = "a123").vin shouldBe "a123"
  }

  "A Car" should "return -1 as year if it is not set" in {
    new Car(creator = "Honda", model = "Accord").year shouldBe -1
  }

  "A Car" should "return empty vin if it is not set" in {
    new Car(creator = "Honda", model = "Accord").vin shouldBe empty
  }

  "A Car" can "set all fields using c-tor" in {
    val car: Car = new Car(creator = "Honda", model = "Accord", year = 2014, vin = "a123")
    car.creator shouldBe "Honda"
    car.model shouldBe "Accord"
    car.year shouldBe 2014
    car.vin shouldBe "a123"
  }

}

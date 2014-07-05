package chapter13.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class ZipAndProductFunctionSpec extends FlatSpec with Matchers {
  "ZipAndProduct function" should "zip passed collections and multiply values in result pairs" in {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)

    zipAndProduct(prices, quantities) shouldBe Vector(50.0, 40.0, 9.95)
  }

  "ZipAndProduct function" should "use 0.0 as default value if first collections contains less elements than the second one" in {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2)

    zipAndProduct(prices, quantities) shouldBe Vector(50.0, 40.0, 0)
  }

  "ZipAndProduct function" should "use 0.0 as default value if second collections contains less elements than the first one" in {
    val prices = List(5.0, 20.0)
    val quantities = List(10, 2, 1)

    zipAndProduct(prices, quantities) shouldBe Vector(50.0, 40.0, 0)
  }
}

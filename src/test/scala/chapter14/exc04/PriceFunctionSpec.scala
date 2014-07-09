package chapter14.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class PriceFunctionSpec extends FlatSpec with Matchers {
  "Price function" should "return price of Product" in {
    price(Product("A pen", 0.99)) shouldBe 0.99
  }

  "Price function" should "return price of Bundle" in {
    price(Bundle("A kit", Product("A pen", 0.99), Product("A book", 2.99), Product("A pencil", 0.49))) shouldBe 4.47 +- 0.02
  }

  "Price function" should "return price of Multiple" in {
    price(Multiple(10, Product("Blackwell Toaster", 29.95))) shouldBe 299.5 +- 0.02
  }
}

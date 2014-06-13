package chapter08.exc04

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class BundleSpec extends FlatSpec with Matchers {
  "A bundle" should "0 as price and empty description if no items passed in c-tor" in {
    val bundle: Bundle = new Bundle()
    bundle.price() shouldBe 0
    bundle.description() shouldBe empty
  }

  val item1: Item = new SimpleItem(5, "item1")
  val item2: Item = new SimpleItem(11, "item2")
  val item3: Item = new SimpleItem(21, "item3")

  val bundle: Bundle = new Bundle(item1, item2, item3)

  "A bundle" should "contain all items passed in c-tor if no addItem method was called" in {
    bundle.items should contain only(item1, item2, item3)
  }

  "A bundle" should "return total price of all its items" in {
    bundle.price() shouldBe item1.price() + item2.price() + item3.price()
  }

  "A bundle" should "return concatenated description split with '; ' of all its items" in {
    bundle.description() shouldBe item1.description() + "; " + item2.description() + "; " + item3.description()
  }

  "A bundle" should "recalculate price and description after adding a new item" in {
    val item4: Item = new SimpleItem(31, "item4")
    bundle.addItem(item4)
    bundle.items should contain only(item1, item2, item3, item4)
    bundle.price() shouldBe item1.price() + item2.price() + item3.price() + item4.price()
    bundle.description() shouldBe item1.description() + "; " + item2.description() + "; " + item3.description() + "; " + item4.description()
  }
}

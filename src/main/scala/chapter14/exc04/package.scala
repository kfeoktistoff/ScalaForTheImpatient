package chapter14

/**
 * Add a case class Multiple that is a subclass of the Item class. For example,
 *  Multiple(10, Article("Blackwell Toaster", 29.95))
 * describes ten toasters. Of course, you should be able to handle any items, such as bundles or multiples,
 * in the second argument. Extend the price function to handle this new case.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc04 {
  def price(item: Item): Double = {
    item match {
      case Product(_, p) => p
      case Bundle(_, items@_*) => items.map(price).sum
      case Multiple(n, product) => n * price(product)
    }
  }
}

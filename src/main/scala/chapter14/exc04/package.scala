package chapter14

/**
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

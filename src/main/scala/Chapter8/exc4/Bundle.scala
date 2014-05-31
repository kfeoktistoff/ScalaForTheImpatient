package Chapter8.exc4

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class Bundle(itemsArg: Item*) extends Item {
  val items = new ArrayBuffer() ++ itemsArg

  override def price(): Double = {
    var totalPrice: Double = 0
    for (item <- items) totalPrice += item.price()
    totalPrice
  }

  override def description(): String = {
    var totalDescription: String = ""
    val descriptionDelimiter = "; "

    for (item <- items) {
      totalDescription += item.description()
      totalDescription += descriptionDelimiter
    }

    totalDescription.dropRight(descriptionDelimiter.length())
  }

  def addItem(item: Item) = items += item
}
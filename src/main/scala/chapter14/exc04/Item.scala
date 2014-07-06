package chapter14.exc04

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

abstract class Item

case class Product(name: String, price: Double) extends Item

case class Multiple(n: Int, item: Item) extends Item

case class Bundle(name: String, items: Item*) extends Item
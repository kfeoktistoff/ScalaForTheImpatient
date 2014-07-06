package chapter14.exc07

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

sealed abstract class Tree

case class Leaf(value: Int) extends Tree

case class Node(subtree: Tree*) extends Tree
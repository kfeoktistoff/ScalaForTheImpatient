package chapter14.exc06

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

sealed abstract class BinaryTree

case class Leaf(value: Int) extends BinaryTree

case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

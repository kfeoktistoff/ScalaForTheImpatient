package chapter14

/**
 * A better way of modeling such trees is with case classes. Let's start with binary trees.
 *
 *   sealed abstract class BinaryTree
 *   case class Leaf(value: Int) extends BinaryTree
 *   case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
 *
 * Write a function to compute the sum of all elements in the leaves.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc06 {
  def binaryTreeLeafSum(btree: BinaryTree): Int = {
    btree match {
      case Leaf(n) => n
      case Node(left, right) => binaryTreeLeafSum(left) + binaryTreeLeafSum(right)
    }
  }
}

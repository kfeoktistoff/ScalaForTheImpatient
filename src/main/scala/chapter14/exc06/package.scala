package chapter14

/**
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

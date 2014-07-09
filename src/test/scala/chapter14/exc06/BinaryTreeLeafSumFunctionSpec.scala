package chapter14.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class BinaryTreeLeafSumFunctionSpec extends FlatSpec with Matchers {
  "BinaryTreeLeafSum function" should "return sum of all leaf values in binary tree" in {
    val left = Node(Leaf(2), Leaf(8))
    val right = Leaf(5)
    val btree: BinaryTree = Node(left, right)
    binaryTreeLeafSum(btree) shouldBe 15
  }
}

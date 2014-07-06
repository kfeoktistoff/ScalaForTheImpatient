package chapter14.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class TreeLeafSumFunctionSpec extends FlatSpec with Matchers {
  "TreeLeafSum function" should "calculate all leaf values" in {
    val tree = Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
    treeLeafSum(tree) shouldBe 18
  }
}

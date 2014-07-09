package chapter14.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

class EvalFunctionSpec extends FlatSpec with Matchers {
  "LeafSum function" should "calculate result of operations on tree leafs" in {
    val tree: TreeWithOp = Node('+', Node('*', Leaf(3), Leaf(8)), Leaf(2), Node('-', Leaf(5)))
    eval(tree) shouldBe 21
  }
}

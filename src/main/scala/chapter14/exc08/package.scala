package chapter14

/**
 * Extend the tree in the preceding exercise so that each non-leaf node stores an operator in addition to the child nodes. Then write a function eval that computes the value. For example, the tree

 *      +
 *     /|\
 *   *  2  -
 *  / \    |
 * 3  8    5
 *
 * has value (3 ? 8) + 2 + (–5) = 21.
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc08 {
  def eval(tree: TreeWithOp): Int = {
    tree match {
      case Leaf(x) => x
      case Node(op, leafs@_*) =>
        op match {
          case '-' => -(leafs map eval sum)
          case '+' => leafs.map(eval).sum
          case '*' => leafs.map(eval).product

        }
      /*case Node(op, node @ Node(_, _*), rest @ _*) => op(eval(node), rest map eval reduce op)
      case Node(op, leaf @ Leaf(x), rest @ _*) => op(x, rest.map(eval).reduce(op))*/
    }
  }
}

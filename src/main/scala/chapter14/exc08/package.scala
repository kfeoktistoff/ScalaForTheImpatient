package chapter14

/**
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

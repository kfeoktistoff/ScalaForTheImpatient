package chapter14

/**
 * Extend the tree in the preceding exercise so that each node can have an arbitrary number of children, and reimplement the leafSum function. The tree in exercise 5 should be expressible as
 *   Node(Node(Leaf(3), Leaf(8)), Leaf(2), Node(Leaf(5)))
 *
 * Created by Kirill Feoktistov on 06.07.14
 */

package object exc07 {
  def treeLeafSum(tree: Tree): Int = {
    tree match {
      case Leaf(n) => n
      case Node(subtree@_*) => subtree.map(treeLeafSum).sum
    }
  }
}
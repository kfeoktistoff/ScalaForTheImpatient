package chapter14

/**
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
package chapter14.exc08

/**
 * Created by Kirill Feoktistov on 06.07.14
 */

sealed abstract class TreeWithOp

case class Leaf(value: Int) extends TreeWithOp

case class Node(op: Char, subtree: TreeWithOp*) extends TreeWithOp
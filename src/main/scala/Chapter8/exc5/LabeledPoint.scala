package Chapter8.exc5

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class LabeledPoint(val label: String, override val x: Double, override val y: Double) extends Point(x, y) {}
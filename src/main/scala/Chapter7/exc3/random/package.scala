package Chapter7.exc3

/**
 * Created by Kirill Feoktistov on 29.05.14
 */

package object random {
  val a: Int = 1664525
  val b: Int = 1013904223
  var seed: Double = _

  def nextInt(): Int = {
    nextDouble().toInt
  }

  def nextDouble(): Double = {
    seed = (seed * a + b) % Math.pow(2, 32)
    seed
  }

  def setSeed(seed: Int) {
    this.seed = seed
  }
}

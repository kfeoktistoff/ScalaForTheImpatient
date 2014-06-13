package chapter07.exc03

/**
 * Write a package random with functions nextInt():Int, nextDouble:Double,
 * and setSeed(seed: Int): Unit. To generate random numbers, use the linear
 * congruential generator
 *
 * next = previous*a+b mod 2^n,

 * where a = 16645254, b = 1013904223, and n = 32.
 *
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

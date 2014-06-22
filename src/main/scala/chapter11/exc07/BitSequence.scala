package chapter11.exc07

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class BitSequence {
  var bits: Long = _

  def apply(bitNumber: Int): Int = {
    if (bitNumber < 0 || bitNumber > 63) throw new IllegalArgumentException("Bit should be 0 or 1")
    if (((bits >>> bitNumber) & 1) != 0) 1 else 0
  }

  def update(bitNumber: Int, bit: Int) = {
    if (bit < 0 || bit > 1 || bitNumber < 0 || bitNumber > 63) throw new IllegalArgumentException("Bit should be 0 or 1")
    bits |= bit << bitNumber
  }
}

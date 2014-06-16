package chapter04

/**
 * What happens when you zip together two strings, such as "Hello".zip("World")?
 * Come up with a plausible use case.
 *
 * Returns vector of pairs of corresponding letters from both strings. Can be useful
 * for decryption of trivial ciphers
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc10 {
  def testZip() = {
    println("Hello".zip("World"))
  }
}

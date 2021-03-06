package chapter06.exc08

/**
 * Write an enumeration describing the eight corners of the RGB color cube.
 * As IDs, use the color values (for example, 0xff0000 for Red).
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

object RgbCube extends Enumeration {
  val Black = Value(0x000000)
  val White = Value(0xffffff)
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
  val Yellow = Value(0xffff00)
  val Purple = Value(0xff00ff)
  val Cian = Value(0x00ffff)
}


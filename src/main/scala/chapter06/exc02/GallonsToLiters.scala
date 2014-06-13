package chapter06.exc02

import chapter06.exc01.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object GallonsToLiters extends UnitConversion {
  def gallonsToLiters(volumeInGallons: Double) = volumeInGallons / LITERS_IN_GALLON
}

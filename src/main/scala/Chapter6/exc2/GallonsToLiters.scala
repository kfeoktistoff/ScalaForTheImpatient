package Chapter6.exc2

import Chapter6.exc1.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object GallonsToLiters extends UnitConversion {
  def gallonsToLiters(volumeInGallons: Double) = volumeInGallons / LITERS_IN_GALLON
}

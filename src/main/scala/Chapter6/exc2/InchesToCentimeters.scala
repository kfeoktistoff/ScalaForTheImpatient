package Chapter6.exc2

import Chapter6.exc1.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object InchesToCentimeters extends UnitConversion {
  def inchesToCentimeters(distanceInInches: Double) = distanceInInches / INCHES_IN_CENTIMETER
}

package chapter06.exc02

import chapter06.exc01.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object InchesToCentimeters extends UnitConversion {
  def inchesToCentimeters(distanceInInches: Double) = distanceInInches / INCHES_IN_CENTIMETER
}

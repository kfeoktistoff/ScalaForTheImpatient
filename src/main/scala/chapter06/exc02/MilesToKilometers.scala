package chapter06.exc02

import chapter06.exc01.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object MilesToKilometers extends UnitConversion {
  def milesToKilometers(distanceInMiles: Double) = distanceInMiles / MILES_IN_KILOMETER
}

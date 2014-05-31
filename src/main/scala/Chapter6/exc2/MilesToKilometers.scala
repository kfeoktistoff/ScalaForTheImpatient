package Chapter6.exc2

import Chapter6.exc1.Conversions._

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

object MilesToKilometers extends UnitConversion {
  def milesToKilometers(distanceInMiles: Double) = distanceInMiles / MILES_IN_KILOMETER
}

package Chapter6.exc1

/**
 * Write an object Conversions with methods inchesToCentimeter, gallonsToLiter and milesToKilometer
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

object Conversions {
  val INCHES_IN_CENTIMETER: Double = 0.393701

  val LITERS_IN_GALLON: Double = 3.78541

  val MILES_IN_KILOMETER: Double = 1.60934

  def inchesToCentimeters(distanceInInches: Double) = distanceInInches / INCHES_IN_CENTIMETER

  def gallonsToLiters(volumeInGallons: Double) = volumeInGallons / LITERS_IN_GALLON

  def milesToKilometers(distanceInMiles: Double) = distanceInMiles / MILES_IN_KILOMETER
}

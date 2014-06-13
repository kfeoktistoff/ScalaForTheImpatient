package chapter05.exc08

/**
 * Make a class Car with read-only properties for manufacturer, model name, and model year,
 * and a read-write property for the license plate. Supply four constructors. All require
 * the manufacturer and model name. Optionally, model year and license plate can also be specified
 * in the constructor. If not, the model year is set to -1 and the licence plate to the empty string.
 * Which constructor are you choosing as the primary constructor? Why?
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

class Car(val creator: String, val model: String) {
  private var privateYear: Long = -1
  private var privateVin: String = ""

  def this(creator: String, model: String, year: Long) = {
    this(creator, model)
    privateYear = year
  }

  def this(creator: String, model: String, vin: String) = {
    this(creator, model)
    privateVin = vin
  }

  def this(creator: String, model: String, year: Long, vin: String) = {
    this(creator, model)
    privateYear = year
    privateVin = vin
  }

  def year = privateYear

  def vin = privateVin
}

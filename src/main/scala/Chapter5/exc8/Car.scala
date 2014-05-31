package Chapter5.exc8

/**
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

package chapter03

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc09 {
  def findAmericanTimeZones() = {
    java.util.TimeZone.getAvailableIDs.filter(_.contains("America")).transform(_.drop("America/".length))
  }
}

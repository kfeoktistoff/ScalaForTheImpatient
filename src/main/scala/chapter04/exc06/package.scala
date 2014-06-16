package chapter04

import java.util

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

/**
 * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY,
 * and similarly for the other weekdays. Demonstrate that the elements are
 * visited in insertion order.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc06 {
  def weekDays = {
    val weekDays: mutable.Map[String, Int] = new util.LinkedHashMap[String, Int]
    weekDays += ("Monday" -> java.util.Calendar.MONDAY)
    weekDays += ("Tuesday" -> java.util.Calendar.TUESDAY)
    weekDays += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
    weekDays += ("Thursday" -> java.util.Calendar.THURSDAY)
    weekDays += ("Friday" -> java.util.Calendar.FRIDAY)
    weekDays += ("Saturday" -> java.util.Calendar.SATURDAY)
    weekDays += ("Sunday" -> java.util.Calendar.SUNDAY)

    weekDays
  }
}

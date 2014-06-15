package chapter04

import java.util

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc06 {
  val weekDays: mutable.Map[String, Int] = new util.LinkedHashMap[String, Int]
  weekDays + ("Monday" -> java.util.Calendar.MONDAY)
  weekDays + ("Tuesday" -> java.util.Calendar.TUESDAY)
  weekDays + ("Wednesday" -> java.util.Calendar.WEDNESDAY)
  weekDays + ("Thursday" -> java.util.Calendar.THURSDAY)
  weekDays + ("Friday" -> java.util.Calendar.FRIDAY)
  weekDays + ("Saturday" -> java.util.Calendar.SATURDAY)
  weekDays + ("Sunday" -> java.util.Calendar.SUNDAY)
}

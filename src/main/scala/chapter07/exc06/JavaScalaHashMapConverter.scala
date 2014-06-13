package chapter07.exc06

import java.util.{HashMap => JavaHashMap}

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable.{HashMap => ScalaHashMap}

/**
 * Write a program that copies all elements from a Java hash map into a Scala hash map.
 * Use imports to rename both classes.
 *
 * Created by Kirill Feoktistov on 29.05.14
 */

class JavaScalaHashMapConverter {
  def convert(javaMap: JavaHashMap[Any, Any]): ScalaHashMap[Any, Any] = {
    if (javaMap == null) throw new IllegalArgumentException("javaMap is null")

    val scalaMap: ScalaHashMap[Any, Any] = new ScalaHashMap[Any, Any]

    for ((k, v) <- javaMap) scalaMap put(k, v)

    scalaMap
  }
}

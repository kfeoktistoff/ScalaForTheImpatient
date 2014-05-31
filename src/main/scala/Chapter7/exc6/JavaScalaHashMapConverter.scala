package Chapter7.exc6

import scala.collection.mutable.{HashMap => ScalaHashMap}
import java.util.{HashMap => JavaHashMap}
import scala.collection.JavaConversions.mapAsScalaMap

/**
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

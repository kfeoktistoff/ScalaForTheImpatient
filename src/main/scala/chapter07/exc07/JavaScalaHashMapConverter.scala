package chapter07.exc07


/**
 * In the preceding exercise, move all imports into the innermost scope possible.
 *
 * Created by Kirill Feoktistov on 29.05.14
 */

class JavaScalaHashMapConverter {

  import java.util.{HashMap => JavaHashMap}

  import scala.collection.mutable.{HashMap => ScalaHashMap}

  def convert(javaMap: JavaHashMap[Any, Any]): ScalaHashMap[Any, Any] = {
    if (javaMap == null) throw new IllegalArgumentException("javaMap is null")

    val scalaMap: ScalaHashMap[Any, Any] = new ScalaHashMap[Any, Any]

    import scala.collection.JavaConversions.mapAsScalaMap
    for ((k, v) <- javaMap) scalaMap put(k, v)

    scalaMap
  }
}
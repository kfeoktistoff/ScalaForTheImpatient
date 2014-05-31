package Chapter7.exc7


/**
 * Created by Kirill Feoktistov on 29.05.14
 */

class JavaScalaHashMapConverter {

  import scala.collection.mutable.{HashMap => ScalaHashMap}
  import java.util.{HashMap => JavaHashMap}

  def convert(javaMap: JavaHashMap[Any, Any]): ScalaHashMap[Any, Any] = {
    if (javaMap == null) throw new IllegalArgumentException("javaMap is null")

    val scalaMap: ScalaHashMap[Any, Any] = new ScalaHashMap[Any, Any]

    import scala.collection.JavaConversions.mapAsScalaMap
    for ((k, v) <- javaMap) scalaMap put(k, v)

    scalaMap
  }
}
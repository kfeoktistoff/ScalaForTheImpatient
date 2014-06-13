package chapter07.exc06

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 29.05.14
 */

class JavaScalaHashMapConverterSpec extends FlatSpec with Matchers {
  "A JavaScalaHashMapConverter" should "throw IllegalArgumentException if null passed in convert method" in {
    a[IllegalArgumentException] shouldBe thrownBy {
      new JavaScalaHashMapConverter().convert(null)
    }
  }

  "A JavaScalaHashMapConverter" should "return scala.collection.mutable.HashMap after convert method calling" in {
    new JavaScalaHashMapConverter().convert(new java.util.HashMap[Any, Any]) shouldBe a[scala.collection.mutable.HashMap[Any, Any]]
  }

  "A JavaScalaHashMapConverter" should "return all values from Java HashMap passed in convert method" in {
    val javaMap: java.util.HashMap[Any, Any] = new java.util.HashMap[Any, Any]
    val values = Map((1, "one"), (2, "two"), (3, "three"))

    for ((k, v) <- values) javaMap put(k, v)

    new JavaScalaHashMapConverter().convert(javaMap) should contain only((1, "one"), (2, "two"), (3, "three"))
  }
}

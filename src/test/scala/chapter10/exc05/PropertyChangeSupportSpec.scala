package chapter10.exc05

import java.beans.PropertyChangeEvent

import org.scalatest.{FlatSpec, Matchers}


/**
 * Created by Kirill Feoktistov on 08.06.14
 */

class PropertyChangeSupportSpec extends FlatSpec with Matchers {
  "A PropertyChangeSupport" should "provide propertyChange(PropertyChangeEvent) method" in {
    try {
      new PointWithPropertyChangeSupport().getClass.getMethod("propertyChange", classOf[PropertyChangeEvent])
    } catch {
      case e: Exception => fail("propertyChange(PropertyChangeEvent) method not found")
    }
  }

  "A PropertyChangeSupport" should "be a java.awt.Point" in {
    new PointWithPropertyChangeSupport() shouldBe a[java.awt.Point]
  }

  "A PropertyChangeSupport" should "be a PropertyChangeSupport" in {
    new PointWithPropertyChangeSupport() shouldBe a[PropertyChangeSupport]
  }
}

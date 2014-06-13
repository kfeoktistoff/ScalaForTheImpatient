package chapter10.Exc01

import java.awt.geom.Ellipse2D
import java.lang.reflect.Method

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class RectangleLikeSpec extends FlatSpec with Matchers {
  "A RectangleLike" should "have method translate(int, int)" in {
    val rectangleLike: Ellipse2D.Double with RectangleLike = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    val translateMethods: Array[Method] = rectangleLike.getClass.getMethods.filter(_.getName.equals("translate"))
    translateMethods.length shouldBe 1
    val translateMethodParameters: Array[Class[_]] = translateMethods(0).getParameterTypes
    translateMethodParameters.length shouldBe 2
    translateMethodParameters(0).getName shouldBe "int"
    translateMethodParameters(1).getName shouldBe "int"
  }

  "A RectangleLike" should "have method grow(int, int)" in {
    val rectangleLike: Ellipse2D.Double with RectangleLike = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
    val growMethods: Array[Method] = rectangleLike.getClass.getMethods.filter(_.getName.equals("grow"))
    growMethods.length shouldBe 1
    val growMethodParameters: Array[Class[_]] = growMethods(0).getParameterTypes
    growMethodParameters.length shouldBe 2
    growMethodParameters(0).getName shouldBe "int"
    growMethodParameters(1).getName shouldBe "int"
  }

}

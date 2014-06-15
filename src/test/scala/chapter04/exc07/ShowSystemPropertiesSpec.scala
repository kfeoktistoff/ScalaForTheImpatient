package chapter04.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

class ShowSystemPropertiesSpec extends FlatSpec with Matchers {
  "ShowSystemProperties function" should "show properties" in {
    showSystemProperties()
  }
}

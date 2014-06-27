package chapter11.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 27.06.14
 */

class RichFileSpec extends FlatSpec with Matchers {
  "A RichFile.unapplySeq" should "extract all path segments and name of the file" in {
    new RichFile().unapplySeq("/home/user/test.txt").get shouldBe Array("home", "user", "test.txt")
  }
}
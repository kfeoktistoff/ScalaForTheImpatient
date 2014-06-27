package chapter11.exc09

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 26.06.14
 */

class RichFileSpec extends FlatSpec with Matchers {
  "A RichFile.unapply" should "extract path, name and extension of the file" in {
    new RichFile().unapply("/home/user/test.txt") shouldBe Some("/home/user", "test", "txt")
  }

  "A RichFile.unapply" should "extract name of hidden file which starts with ." in {
    new RichFile().unapply("/home/user/.app.conf") shouldBe Some("/home/user", ".app", "conf")
  }

  "A RichFile.unapply" should "extract name of file without extension" in {
    new RichFile().unapply("/home/user/config") shouldBe Some("/home/user", "config", "")
  }

  "A RichFile.unapply" should "extract name of hidden file without extension" in {
    new RichFile().unapply("/home/user/.gitignore") shouldBe Some("/home/user", ".gitignore", "")
  }

  "A RichFile.unapply" should "extract empty name and extension if path to directory passed (ends with '/')" in {
    new RichFile().unapply("/home/user/") shouldBe Some("/home/user", "", "")
  }

}
package chapter06.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class RgbCubeSpec extends FlatSpec with Matchers {
  "A RgbCube" should "return 0x000000 as Black" in {
    RgbCube.Black.id shouldBe 0x000000
  }

  "A RgbCube" should "return 0xffffff as White" in {
    RgbCube.White.id shouldBe 0xffffff
  }

  "A RgbCube" should "return 0xff0000 as Red" in {
    RgbCube.Red.id shouldBe 0xff0000
  }

  "A RgbCube" should "return 0x00ff00 as Green" in {
    RgbCube.Green.id shouldBe 0x00ff00
  }

  "A RgbCube" should "return 0x0000ff as Blue" in {
    RgbCube.Blue.id shouldBe 0x0000ff
  }

  "A RgbCube" should "return 0xffff00 as Yellow" in {
    RgbCube.Yellow.id shouldBe 0xffff00
  }

  "A RgbCube" should "return 0xff00ff as Purple" in {
    RgbCube.Purple.id shouldBe 0xff00ff
  }

  "A RgbCube" should "return 0x00ffff as Cian" in {
    RgbCube.Cian.id shouldBe 0x00ffff
  }
}

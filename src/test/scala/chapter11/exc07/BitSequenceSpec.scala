package chapter11.exc07

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class BitSequenceSpec extends FlatSpec with Matchers {
  "A BitSequence" should "return bit in nth position after apply() method calling" in {
    val bitSequence: BitSequence = new BitSequence()
    bitSequence(1) shouldBe 0
    bitSequence.bits = 2L
    bitSequence(1) shouldBe 1
  }

  "A BitSequence" should "set bit in nth position after update() method calling" in {
    val bitSequence: BitSequence = new BitSequence()
    bitSequence(1) shouldBe 0
    bitSequence(1) = 1
    bitSequence(1) shouldBe 1
  }

  "A BitSequence" should "throw IllegalArgumentException if bit passed not as (0,1)" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      val bitSequence: BitSequence = new BitSequence()
      bitSequence(1) = 2
    }
  }

  "A BitSequence" should "throw IllegalArgumentException if bit position is not in (0,63) in update() method" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      val bitSequence: BitSequence = new BitSequence()
      bitSequence(64) = 1
    }

    an[IllegalArgumentException] shouldBe thrownBy {
      val bitSequence: BitSequence = new BitSequence()
      bitSequence(-1) = 1
    }
  }

  "A BitSequence" should "throw IllegalArgumentException if bit position is not in (0,63) in apply() method" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      val bitSequence: BitSequence = new BitSequence()
      bitSequence(64)
    }

    an[IllegalArgumentException] shouldBe thrownBy {
      val bitSequence: BitSequence = new BitSequence()
      bitSequence(-1)
    }
  }
}

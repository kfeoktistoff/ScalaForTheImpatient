package chapter11.exc08

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 25.06.14
 */

class MatrixMxNSpec extends FlatSpec with Matchers {
  "A MatrixMxN" should "return 0s as dimensions if matrix is empty" in {
    val matrix = new MatrixMxN(Array())
    matrix.ncols shouldBe 0
    matrix.nrows shouldBe 0
  }

  "A MatrixMxN" should "throw IllegalArgumentException if it contains rows with different length" in {
    an[IllegalArgumentException] shouldBe thrownBy {
      new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5), Array(6, 7, 8)))
    }
  }

  "A MatrixMxN.nrow" should "return row count" in {
    val matrix: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5, 6)))
    matrix.nrows shouldBe 2
  }

  "A MatrixMxN.ncol" should "return col count" in {
    val matrix: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5, 6)))
    matrix.ncols shouldBe 3
  }

  "A MatrixMxN" should "throw IllegalArgumentException if + matrix has different dimension" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5, 6)))
    val matrix2: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3)))

    an[IllegalArgumentException] shouldBe thrownBy {
      matrix1 + matrix2
    }
  }

  "A MatrixMxN" should "addition operation correctly" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5, 6)))
    val matrix2: MatrixMxN = new MatrixMxN(Array(Array(11, 12, 13), Array(14, 15, 16)))

    matrix1 + matrix2 shouldBe new MatrixMxN(Array(Array(12, 14, 16), Array(18, 20, 22)))
  }

  "A MatrixMxN" should "do multiplication on scalar operation correctly" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(1, 2, 3), Array(4, 5, 6)))
    matrix1 * 2 shouldBe new MatrixMxN(Array(Array(2, 4, 6), Array(8, 10, 12)))
  }

  "A MatrixMxN" should "do multiplication on another matrix operation correctly" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(2, 3, 4), Array(1, 0, 0)))
    val matrix2: MatrixMxN = new MatrixMxN(Array(Array(0, 1000), Array(1, 100), Array(0, 10)))

    matrix1 * matrix2 shouldBe new MatrixMxN(Array(Array(3, 2340), Array(0, 1000)))
  }

  "A MatrixMxN" should "throw IllegalArgumentException if ncols != other.nrows" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(2, 3, 4, 5), Array(1, 0, 0, 0)))
    val matrix2: MatrixMxN = new MatrixMxN(Array(Array(0, 1000), Array(1, 100), Array(0, 10)))

    an[IllegalArgumentException] shouldBe thrownBy {
      matrix1 * matrix2
    }
  }

  "A MatrixMxN" should "throw IllegalArgumentException if nrows != other.ncols" in {
    val matrix1: MatrixMxN = new MatrixMxN(Array(Array(2, 3, 4), Array(1, 0, 0), Array(1, 0, 0)))
    val matrix2: MatrixMxN = new MatrixMxN(Array(Array(0, 1000), Array(1, 100), Array(0, 10)))

    an[IllegalArgumentException] shouldBe thrownBy {
      matrix1 * matrix2
    }
  }


}

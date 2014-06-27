package chapter11.exc08

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class MatrixMxN(private val matrix: Array[Array[Int]]) {
  for (row <- matrix if row.length != matrix(0).length) throw new IllegalArgumentException("Matrix must have rows with equal length")

  def nrows: Int = matrix.length

  def ncols: Int = if (nrows > 0) matrix(0).length else 0

  def +(other: MatrixMxN) = {
    if (nrows != other.nrows || ncols != other.ncols) throw new IllegalArgumentException("Matrix has different dimension")

    val resultMatrix = Array.ofDim[Int](nrows, ncols)

    for (row <- 0 until nrows) {
      for (col <- 0 until ncols) {
        resultMatrix(row)(col) = matrix(row)(col) + other.matrix(row)(col)
      }
    }

    new MatrixMxN(resultMatrix)
  }

  def *(scalar: Int) = {
    val resultMatrix = Array.ofDim[Int](nrows, ncols)

    for (row <- 0 until nrows) {
      for (col <- 0 until ncols) {
        resultMatrix(row)(col) = scalar * matrix(row)(col)
      }
    }

    new MatrixMxN(resultMatrix)
  }

  def *(other: MatrixMxN) = {
    if (ncols != other.nrows || nrows != other.ncols) {
      throw new IllegalArgumentException("Matrix dimensions do not allow multiplication")
    }

    val resultMatrix = Array.ofDim[Int](nrows, other.ncols)

    for (row <- 0 until nrows) {
      var resultCol: Int = 0

      for (ocol <- 0 until other.ncols) {
        var resultCell: Int = 0

        for (col <- 0 until ncols) {
          resultCell += matrix(row)(col) * other.matrix(col)(resultCol)
        }

        resultMatrix(row)(resultCol) = resultCell
        resultCol += 1
      }
    }

    new MatrixMxN(resultMatrix)
  }

  override def equals(other: Any): Boolean = {
    if (other == null ||
      !other.isInstanceOf[MatrixMxN] ||
      other.asInstanceOf[MatrixMxN].ncols != this.ncols ||
      other.asInstanceOf[MatrixMxN].nrows != this.nrows
    ) return false

    matrix.deep.equals(other.asInstanceOf[MatrixMxN].matrix.deep)
  }

  override def hashCode: Int = {
    var hashCode: Int = 0

    for (row <- 0 until nrows) {
      hashCode += matrix(row).deep.hashCode()
    }

    hashCode
  }

  override def toString = {
    var asString: String = "\n"

    for (row <- 0 until nrows) {
      for (col <- 0 until ncols) {
        asString += matrix(row)(col) + " "
      }

      asString = asString.dropRight(1) + '\n'
    }

    asString
  }
}

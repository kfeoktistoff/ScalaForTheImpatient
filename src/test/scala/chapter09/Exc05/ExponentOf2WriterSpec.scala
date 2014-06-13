package chapter09.Exc05

import chapter09.OutputLinesAccumulator
import org.mockito.Matchers._
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.06.14
 */

class ExponentOf2WriterSpec extends FlatSpec with Matchers with MockitoSugar {
  "An ExponentOf2Writer" should "print exponents of 2" in {
    val writer = mock[java.io.PrintWriter]
    val output: OutputLinesAccumulator = new OutputLinesAccumulator
    doAnswer(output).when(writer).println(any[String])
    new ExponentOf2Writer("testPath").print(writer)
    output.output should contain inOrderOnly("0\t1.0"
      , "1\t" + 1 / 2.asInstanceOf[Double]
      , "2\t" + 1 / 4.asInstanceOf[Double]
      , "3\t" + 1 / 8.asInstanceOf[Double]
      , "4\t" + 1 / 16.asInstanceOf[Double]
      , "5\t" + 1 / 32.asInstanceOf[Double]
      , "6\t" + 1 / 64.asInstanceOf[Double]
      , "7\t" + 1 / 128.asInstanceOf[Double]
      , "8\t" + 1 / 256.asInstanceOf[Double]
      , "9\t" + 1 / 512.asInstanceOf[Double]
      , "10\t" + 1 / 1024.asInstanceOf[Double]
      , "11\t" + 1 / 2048.asInstanceOf[Double]
      , "12\t" + 1 / 4096.asInstanceOf[Double]
      , "13\t" + 1 / 8192.asInstanceOf[Double]
      , "14\t" + 1 / 16384.asInstanceOf[Double]
      , "15\t" + 1 / 32768.asInstanceOf[Double]
      , "16\t" + 1 / 65536.asInstanceOf[Double]
      , "17\t" + 1 / 131072.asInstanceOf[Double]
      , "18\t" + 1 / 262144.asInstanceOf[Double]
      , "19\t" + 1 / 524288.asInstanceOf[Double]
      , "20\t" + 1 / 1048576.asInstanceOf[Double]
      )

    verify(writer).flush()
  }
}

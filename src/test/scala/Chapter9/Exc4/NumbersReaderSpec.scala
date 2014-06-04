package Chapter9.Exc4

import org.scalatest.{Matchers, FlatSpec}
import org.scalatest.mock.MockitoSugar
import java.io._
import org.mockito.Mockito._
import java.nio.charset.StandardCharsets

/**
 * Created by Kirill Feoktistov on 01.06.14
 */

class NumbersReaderSpec extends FlatSpec with Matchers with MockitoSugar {
  "A NumbersReader" should "throw exception if file size is bigger 1024 (java.util.Scanner inner buffer)" in {
    val file = mock[File]
    when(file.length()).thenReturn(1025)

    an[IllegalArgumentException] shouldBe thrownBy {
      new NumbersReader(file).readNumbersFromFile(file)
    }
  }

  "A NumbersReader" should "provide max(), min(), sum(), avg() operations with numbers from file" in {
    val fileContent = "0.75 9 -2 -2.5"

    val numbersReader: NumbersReader = new NumbersReader

    numbersReader.readNumbersFromFile(new ByteArrayInputStream(fileContent.getBytes(StandardCharsets.UTF_8)))

    numbersReader.max() shouldBe 9
    numbersReader.min() shouldBe -2.5
    numbersReader.sum() shouldBe 5.25
    numbersReader.avg() shouldBe 1.3125
  }
}

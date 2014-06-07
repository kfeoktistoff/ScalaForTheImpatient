package Chapter9.Exc10

import org.scalatest.{Matchers, FlatSpec}
import java.io.{FileInputStream, ObjectInputStream, FileOutputStream, ObjectOutputStream}
import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class PersonSpec extends FlatSpec with Matchers {
  "A Person" should "be Serializable" in {
    new Person shouldBe a[Serializable]
  }

  "A Person's friends" should "not be changed during serialization" in {
    val john = new Person("John")
    john.friends = ArrayBuffer(new Person("Bill"), new Person("Jack"))

    val out = new ObjectOutputStream(new FileOutputStream("john.obj"))
    out.writeObject(john)
    out.close()

    val in = new ObjectInputStream(new FileInputStream("john.obj"))
    val deSerializedJohn = in.readObject().asInstanceOf[Person]
    deSerializedJohn.friends shouldEqual john.friends
  }
}

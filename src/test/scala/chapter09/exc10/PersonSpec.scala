package chapter09.exc10

import java.io.{FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import org.scalatest.{FlatSpec, Matchers}

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

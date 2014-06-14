package chapter09.exc10

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

@SerialVersionUID(42L) class Person(val name: String = "John Doe") extends Serializable {
  var friends = new ArrayBuffer[Person]

  override def equals(obj: Any): Boolean = {
    if (obj == null || !obj.isInstanceOf[Person]) false

    val that: Person = obj.asInstanceOf[Person]

    that.name.equals(this.name) && that.friends.equals(this.friends)
  }

  override def hashCode(): Int = {
    71 * name.hashCode + friends.hashCode
  }
}

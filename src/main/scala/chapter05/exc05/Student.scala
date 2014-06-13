package chapter05.exc05

import scala.beans.BeanProperty

/**
 * Make a class Student with read-write JavaBeans properties name (of type String) and is (of type Long).
 * What methods are generated (Use javap to check.) Can you call the JavaBeans getters and setters in Scala. Should you?
 *
 * Created by Kirill Feoktistov on 27.05.14
 */

class Student {
  @BeanProperty
  var id: Long = _
  @BeanProperty
  var name: String = _
}

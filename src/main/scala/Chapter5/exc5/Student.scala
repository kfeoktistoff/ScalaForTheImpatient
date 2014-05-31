package Chapter5.exc5

import scala.beans.BeanProperty

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class Student {
  @BeanProperty
  var id: Long = _
  @BeanProperty
  var name: String = _
}

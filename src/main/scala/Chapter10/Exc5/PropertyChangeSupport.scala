package Chapter10.Exc5

import java.beans.PropertyChangeEvent

/**
 * Created by Kirill Feoktistov on 08.06.14
 */
trait PropertyChangeSupport extends Serializable {
  def propertyChange(event: PropertyChangeEvent) {}
}

class PointWithPropertyChangeSupport extends java.awt.Point with PropertyChangeSupport {}
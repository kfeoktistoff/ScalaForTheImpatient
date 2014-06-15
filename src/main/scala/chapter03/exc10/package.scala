package chapter03

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

/**
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc10 {
  val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
  flavors.getNativesForFlavor(DataFlavor.imageFlavor)
}

package Chapter7.exc1

/**
 * Created by Kirill Feoktistov on 29.05.14
 */


package com {
package horstmann {

class Master {

}

package impatient {

class Slave1 {
  def master: Master = new Master //Visible from child packages
}

}

}

}

package com.horstmann.impatient {

import Chapter7.exc1.com.horstmann.Master

//Necessary

class Slave2 {
  def master: Master = new Master
}

}
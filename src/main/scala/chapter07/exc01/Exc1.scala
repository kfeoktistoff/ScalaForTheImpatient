package chapter07.exc01

/**
 * Write an example program to demonstrate that
 * package com.horstmann.impatient
 * is not the same as
 * package com
 * package horstmann
 * package impatient
 *
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

import chapter07.exc01.com.horstmann.Master

//Necessary

class Slave2 {
  def master: Master = new Master
}

}
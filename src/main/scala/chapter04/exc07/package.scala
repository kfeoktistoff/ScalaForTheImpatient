package chapter04

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
 * Print a table of all Java properties, like this:
 *
 * java.runtime.name     | Java(TM) SE Runtime Environment
 * sun.boot.library.path | /home/apps/jdk1.6.0_21/jre/lib/i386
 * java.vm.version       | 17.0-b16
 * java.vm.vendor        | Sun Microsystems Inc.
 * java.vendor.url       | http://java.sun.com/
 * path.separator        | :
 * java.vm.name          | Java HotSpot(TM) Server VM
 *
 * You need to find the length of the longest key before you can print the table.
 *
 * Created by Kirill Feoktistov on 15.06.14
 */

package object exc07 {
  val placeHolder: String = " "
  val colSplitter: String = " | "

  def showSystemProperties() = {
    val props: scala.collection.Map[String, String] = System.getProperties
    val maxKey = props.keySet.map(_.length).max

    for ((k, v) <- props) {
      println(k + placeHolder * (maxKey - k.length) + colSplitter + v)
    }
  }
}

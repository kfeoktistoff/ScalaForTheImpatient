package chapter04

import scala.collection.JavaConversions.propertiesAsScalaMap

/**
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

package chapter09.exc09

import java.io.File

import org.mockito.Matchers.any
import org.mockito.Mockito._
import org.scalatest.mock.MockitoSugar
import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable.ArrayBuffer

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class ScalaClassesCounterSpec extends FlatSpec with Matchers with MockitoSugar {
  "A ScalaClassesCounter" should "count all .scala files" in {
    val counter = mock[ScalaClassesCounter]

    val javaClass = mock[File]
    when(javaClass.getName) thenReturn "javaClassName.java"

    val javaDirectory = mock[File]
    when(javaDirectory.isDirectory) thenReturn true
    when(javaDirectory.listFiles) thenReturn Array(javaClass)

    val scalaClass = mock[File]
    when(scalaClass.getName) thenReturn "scalaClassName.scala"

    val scalaDirectory = mock[File]
    when(scalaDirectory.isDirectory) thenReturn true
    when(scalaDirectory.listFiles) thenReturn Array(scalaClass)

    val dirs: ArrayBuffer[File] = new ArrayBuffer[File] += scalaDirectory += javaDirectory

    when(counter.subDirs(any[String])) thenReturn dirs.iterator
    when(counter.countScalaClassesInDirectory()).thenCallRealMethod()

    counter.countScalaClassesInDirectory() shouldBe 1
  }
}

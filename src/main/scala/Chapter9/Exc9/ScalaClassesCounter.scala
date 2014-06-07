package Chapter9.Exc9

import java.io.File

/**
 * Created by Kirill Feoktistov on 07.06.14
 */

class ScalaClassesCounter {
  def countScalaClassesInDirectory(rootDirectoryPath: String = "src/main") = {
    val scalaClassExtension: String = ".scala"
    var classesCount = 0

    for (directory <- subDirs(rootDirectoryPath)) {
      for (file <- directory.listFiles if file.getName endsWith scalaClassExtension) {
        classesCount += 1
      }
    }

    classesCount
  }

  def subDirs(rootDirectoryPath: String): Iterator[File] = {
    subDirs(new File(rootDirectoryPath))
  }

  /**
   * Directory traversal method given in the book
   */
  def subDirs(dir: File): Iterator[File] = {
    val children = dir.listFiles.filter(_.isDirectory)
    children.toIterator ++ children.toIterator.flatMap(subDirs _)
  }

  def print(line: String) {
    println(line)
  }
}

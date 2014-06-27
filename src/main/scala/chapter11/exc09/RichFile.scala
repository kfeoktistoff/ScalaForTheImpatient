package chapter11.exc09

/**
 * Created by Kirill Feoktistov on 26.06.14
 */

class RichFile() {
  def unapply(filePath: String) = {
    val path = filePath.substring(0, filePath.lastIndexOf('/'))
    val nameWithExtension = filePath.substring(filePath.lastIndexOf('/') + 1)

    val extension = if (hasExtension(nameWithExtension)) {
      if (nameWithExtension.count(_ == '.') == 1 && isHidden(nameWithExtension))
        ""
      else {
        nameWithExtension.substring(nameWithExtension.lastIndexOf('.') + 1)
      }
    } else {
      ""
    }

    val name = if (extension.isEmpty) nameWithExtension else nameWithExtension.dropRight(extension.length + 1)

    Some(path, name, extension)
  }

  def hasExtension(fileName: String): Boolean = {
    fileName.contains('.')
  }

  def isHidden(fileName: String): Boolean = {
    fileName.indexOf('.') == 0
  }
}

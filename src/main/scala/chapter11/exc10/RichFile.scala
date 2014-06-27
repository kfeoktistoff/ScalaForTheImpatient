package chapter11.exc10

/**
 * Created by Kirill Feoktistov on 27.06.14
 */

class RichFile() {
  def unapplySeq(filePath: String) = {
    Some(filePath.split('/').filter(!_.isEmpty))
  }
}

package chapter11.exc10

/**
 * Define an unapplySeq operation for the RichFile class that extracts all path segments.
 * For example, for the file /home/cay/readme.txt, you should produce a sequence of three
 * segments: home, cay, and readme.txt.
 *
 * Created by Kirill Feoktistov on 27.06.14
 */

class RichFile() {
  def unapplySeq(filePath: String) = {
    Some(filePath.split('/').filter(!_.isEmpty))
  }
}

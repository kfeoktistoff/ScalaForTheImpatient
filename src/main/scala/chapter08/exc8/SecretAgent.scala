package chapter08.exc8

/**
 * Created by Kirill Feoktistov on 31.05.14
 */

class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override val toString = "secret"
}

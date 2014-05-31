package Chapter5.exc1

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1
  }

  def current = value
}

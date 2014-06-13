package chapter05.exc01

/**
 * Improve the Counter class in Section 1 so that it doesn't turn negative at Int.MaxValue
 *
 * Created by Kirill Feoktistov on 28.05.14
 */

class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue) value += 1
  }

  def current = value
}

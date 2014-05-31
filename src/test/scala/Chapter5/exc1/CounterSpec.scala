package Chapter5.exc1

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class CounterSpec extends FlatSpec with Matchers {
  "A Counter" should "set value as 0 after creating" in {
    assert(new Counter().current == 0)
  }

  "A Counter" should "increment value after increment call" in {
    val counter: Counter = new Counter()
    counter.increment()
    assert(counter.current == 1)
  }

  "A Counter" should "not increment value if it is MaxValue" in {
    val counter: Counter = new Counter()
    for (i <- 0 until Int.MaxValue) counter.increment()
    counter.increment()
    assert(counter.current == Int.MaxValue)
  }

}

package chapter15.exc06

/**
 * Created by Kirill Feoktistov on 13.07.14
 */

class HasVolatileField {
  @volatile
  var vol: Boolean = false

  val thread1: Thread = new Thread {
    override def run(): Unit = {
      Thread.sleep(10000)
      vol = true
      println("thread1: vol is now true")
    }
  }

  val thread2: Thread = new Thread {
    override def run(): Unit = {
      while (!vol) {
        Thread.sleep(1)
      }

      println("thread2: vol is true")
    }
  }

  def test() {
    thread1.run()
    thread2.run()
  }
}

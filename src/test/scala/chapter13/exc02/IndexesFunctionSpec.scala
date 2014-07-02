package chapter13.exc01

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

/**
 * Created by Kirill Feoktistov on 01.07.14
 */

class IndexesFunctionSpec extends FlatSpec with Matchers {
  "Indexes function" should "" in {
    indexes("Mississippi") shouldBe Map(
      ('M', mutable.TreeSet(0))
      , ('i', mutable.TreeSet(1, 4, 7, 10))
      , ('s', mutable.TreeSet(2, 3, 5, 6))
      , ('p', mutable.TreeSet(8, 9))
    )
  }
}

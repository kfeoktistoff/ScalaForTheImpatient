package chapter13.exc10

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 05.07.14
 */

class FindCharFrequenciesFunctionSpec extends FlatSpec with Matchers {
  "FindCharFrequencies function" should "" in {
    findCharFrequencies("Mississippi").toArray should contain only(('M', 1), ('i', 4), ('s', 4), ('p', 2))
  }
}

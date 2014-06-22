package chapter11.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 22.06.14
 */

class TableSpec extends FlatSpec with Matchers {
  "A Table" should "return <table><tr><td></td></tr></table> (empty table) by default" in {
    Table().toString shouldBe "<table><tr><td></td></tr></table>"
  }

  "Table()" should "create a new column after | operator" in {
    val table: Table = Table() | "Java" | "Scala"
    table.toString shouldBe "<table><tr><td>Java</td><td>Scala</td></tr></table>"
  }

  "A Table()" should "put cells in new row after || operator" in {
    val table: Table = Table() | "Java" | "Scala" || "Gosling" | "Odersky"
    table.toString shouldBe "<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr></table>"
  }
}
package chapter11.exc05

/**
 * Provide operators that construct an HTML table. For example,
 *  Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
 * should produce
 * <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
 *
 * Created by Kirill Feoktistov on 22.06.14
 */

class Table {
  private var table: String = ""

  def |(column: String) = {
    table += "<td>" + column + "</td>"
    this
  }

  def ||(column: String) = {
    table += "</tr><tr>"
    this | column
  }

  override def toString = {
    "<table><tr>" + (if (table.isEmpty) "<td></td>" else table) + "</tr></table>"
  }
}

object Table {
  def apply() = new Table
}
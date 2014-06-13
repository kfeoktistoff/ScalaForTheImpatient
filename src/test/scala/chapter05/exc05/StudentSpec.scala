package chapter05.exc05

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by Kirill Feoktistov on 27.05.14
 */

class StudentSpec extends FlatSpec with Matchers {
  "A Student" should "allow edit read and edit id" in {
    val student = new Student()
    student.id = 5L
    student.id shouldBe 5L
  }

  "A Student" should "allow edit read and edit name" in {
    val student = new Student()
    student.name = "John"
    student.name shouldBe "John"
  }

  "A Student" should "provide getter and setter for id" in {
    val student = new Student()
    student.setId(5)
    student.getId shouldBe 5L
  }

  "A Student" should "provide getter and setter for name" in {
    val student = new Student()
    student.setName("John")
    student.getName shouldBe "John"
  }
}

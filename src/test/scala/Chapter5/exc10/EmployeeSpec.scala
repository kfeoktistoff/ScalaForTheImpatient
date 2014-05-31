package Chapter5.exc10

import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by Kirill Feoktistov on 28.05.14
 */

class EmployeeSpec extends FlatSpec with Matchers {
  "An Employee" should "set default values if no-arg c-tor called" in {
    assert(new Employee().name equals "John Q. Public")
    new Employee().salary shouldBe 0.0 +- 0.1
  }

  "An Employee" should "set default value for name if it is not passed in c-tor" in {
    val employee: Employee = new Employee(salaryArg = 50.0)
    employee.name shouldBe "John Q. Public"
    employee.salary shouldBe 50.0 +- 0.1
  }

  "An Employee" should "set default value for salary if it is not passed in c-tor" in {
    val employee: Employee = new Employee(nameArg = "John")
    employee.salary shouldBe 0.0 +- 0.1
    employee.name shouldBe "John"
  }

  "An Employee" should "set set fields if they are passed in c-tor" in {
    val employee: Employee = new Employee(nameArg = "John", salaryArg = 50.0)
    employee.salary shouldBe 50.0 +- 0.1
    employee.name shouldBe "John"
  }

}

package chapter15.exc02

/**
 * Created by Kirill Feoktistov on 11.07.14
 */

@deprecated //class
class DeprecatedAnnotationTest[@deprecated T] @deprecated()(var mainConstructorArg: Int) {
  //generic parameter and main constructor
  @deprecated //field
  val someField: Int@deprecated = 0 //type

  @deprecated //method
  def someMethod(@deprecated arg1: Int, arg2: Int) {
    //argument
    @deprecated //local variable
    var someLocalVariable = 0

    someLocalVariable = 5: @deprecated //expression

  }
}

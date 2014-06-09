package Chapter6.exc3

/**
 * Define an Origin object that extends java.awt.Point. Why is this not actually
 * a good idea? (Have a close look at the methods of the Point class.)
 *
 * Answer: an application will have mutable singleton Origin. It will bring a lot
 * of problems with debugging during searching place where the object was changed.
 *
 * Created by Kirill Feoktistov on 28.05.14
 */
object Origin extends java.awt.Point {
}

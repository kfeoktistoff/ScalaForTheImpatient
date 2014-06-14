package chapter10.exc07

/**
 * Created by Kirill Feoktistov on 14.06.14
 */

trait Filter {
  def filter(input: Array[Int]): Array[Int] = ???
}

trait EvenFilter extends Filter {
  override abstract def filter(input: Array[Int]): Array[Int] = {
    input.filter(_ % 2 == 1)
  }
}

trait PrimeFilter extends Filter {
  override abstract def filter(input: Array[Int]): Array[Int] = {
    input.filter(BigInt(_).isProbablePrime(1))
  }
}
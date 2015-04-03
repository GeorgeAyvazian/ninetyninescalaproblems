
object NinetyNineScalaProblems extends App {

  val ints: List[Int] = 1 :: 1 :: 2 :: 3 :: 5 :: 8 :: Nil
  println(last(ints))
  println(penultimate(ints))
  println(nth(2, ints))
  println(length(ints))
  println(reverse(ints))

  def last[T](list: List[T]): T = list.length match {
    case 1 => list.head
    case _ => last(list.tail)
  }

  def penultimate[T](list: List[T]): T = list.length match {
    case 0 => null.asInstanceOf[T]
    case 2 => list.head
    case _ => penultimate(list.tail)
  }

  def nth[T](n: Int, list: List[T]): T = n match {
    case 0 => list.head
    case _ => nth(n - 1, list.tail)
  }

  def length_[T](length: Int, list: List[T]): Int = if (list == List.empty) length else length_(length + 1, list.tail)

  def length[T](list: List[T]): Int = length_(0, list)

  def reverse[T](list: List[T]): List[T] = last(list) :: reverse(list.tail)

}

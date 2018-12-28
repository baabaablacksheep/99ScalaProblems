
object P17 {

  def getResult[A](n: Int, list: List[A]): Unit = {
    val splittedList: (List[A], List[A]) = split(n, list)
    println(s"N Splitted List : $splittedList")
  }

  //  def split[A](i: Int, list: List[A]): (List[A],List[A]) ={
  //    list.splitAt(i)
  //  }

  //My Recursive
  def split[A](N: Int, list: List[A]): (List[A], List[A]) = {
    def splitter(c: Int, rem: List[A], firstList: List[A]): (List[A], List[A]) = (c, rem) match {
      case (_, Nil) => null
      case (N, h :: tail) => (firstList, h::tail)
      case (_, h :: tail) => splitter(c + 1, tail, firstList :+ h)
    }
    splitter(0, list, List.empty[A])
  }

  // Simple recursion.
  def splitRecursive[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    case (_, Nil) => (Nil, Nil)
    case (0, list) => (Nil, list)
    case (n, h :: tail) => {
      val (pre, post) = splitRecursive(n - 1, tail)
      (h :: pre, post)
    }
  }
}

object P18 {

  def getResult[A](start: Int, end: Int, list: List[A]): Unit = {
    val slicedList: List[A] = slice(start, end, list)
    println(s"N Sliced List : $slicedList")
  }

  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    list.splitAt(end)._1.splitAt(start)._2
  }

  def sliceRecursive[A](start: Int, end: Int, list: List[A]): List[A] = {
    def sliceEnd(start: Int, end: Int, list: List[A]): List[A] = (start, end, list) match {
      case (_, _, Nil) => Nil
      case (_, `end` , h :: tail) => List.empty[A] //need to do something here
    }
    sliceEnd(1,2,list)
  }

}
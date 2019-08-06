
object P19 {

  def getResult[A](pivot: Int, list: List[A]): Unit = {
    val rotatedList: List[A] = rotate(pivot,list)
    println(s"N Rotated List : $rotatedList")
  }

  def rotate[A](pivot: Int, list: List[A]): List[A] ={
    list.zipWithIndex.takeWhile(_._2<pivot).map(_._1)
  }

}
object P01 {
  def getResult(list:List[Int]): Unit ={
    val lastElement:Int = last(list)
    println(s"Last Element of The List is : $lastElement")
  }
  def last(list: List[Int]): Int ={
    list.last
  }

}

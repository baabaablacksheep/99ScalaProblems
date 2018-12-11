object P04 {
  def getResult(list: List[Int]): Unit ={
    val lengthOfList:Int = listLength(list)
    println(s"Length of the The List is : $lengthOfList")
  }
  def listLength(list: List[Int]): Int ={
    val lengthOfList : Int = list.length
    lengthOfList
  }

}

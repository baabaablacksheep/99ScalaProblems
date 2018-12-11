object P05 {
  def getResult(list: List[Int]): Unit ={
    val reversedList:List[Int] = reverseList(list)
    println(s"Reversed List of the The List is : $reversedList")
  }
  def reverseList(list: List[Int]): List[Int] ={
    list.reverse
  }

}

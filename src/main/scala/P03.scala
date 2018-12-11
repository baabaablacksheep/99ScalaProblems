object P03 {
  def getResult(list: List[Int], index: Int): Unit ={
    val kthElement:Int = nth(list, index)
    println(s"$index th Element of The List is : $kthElement")
  }
  def nth(list: List[Int], index: Int): Int ={
    list(index)
  }

}

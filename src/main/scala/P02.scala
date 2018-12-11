object P02 {
  def getResult(list: List[Int]): Unit ={
    val penultimateElement:Int = penultimate(list)
    println(s"PenultimateElement Element of The List is : $penultimateElement")
  }
  def penultimate(list: List[Int]): Int ={
    val lengthOfList : Int = list.length
    list(lengthOfList-2)
  }

}

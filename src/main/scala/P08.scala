object P08 {
  def getResult(list: List[Int]): Unit ={
    val compressList: List[Int] = compress(list)
    println(s"List Without Duplicates is : $compressList")
  }
  def compress(list: List[Int]): List[Int] ={
    list.distinct
  }

}

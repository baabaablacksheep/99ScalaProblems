
object P15 {

  import P13.encodeDirect
  import P12.decode

  def getResult[A](n: Int, list: List[A]): Unit ={
    val duplicatedList: List[A] = duplicateN(n,list)
    println(s"N times Duplicated List is : $duplicatedList")
  }

//  def duplicateN[A](n: Int,list: List[A]) : List[A] = {
//    decode(encodeDirect(list).map(x=>(x._1*n,x._2)))
//  }

  def duplicateN[A](n: Int,list: List[A]): List[A]={
    list.flatMap{ List.fill(n)(_)}
  }
}
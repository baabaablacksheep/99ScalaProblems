
object P14 {
  import P13.encodeDirect
  import P12.decode

  def getResult[A](list: List[A]): Unit ={
    val duplicatedList: List[A] = duplicate(list)
    println(s"Duplicated List is : $duplicatedList")
  }

//  def duplicate[A](list: List[A]) : List[A] = {
//    decode(encodeDirect(list).map(x=>(x._1*2,x._2)))
//  }

  def duplicate[A](list: List[A]): List[A]={
    list.flatMap(x=>List(x,x))
  }
}
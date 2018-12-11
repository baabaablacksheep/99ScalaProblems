//object P10 {
//  def getResult(list: List[Int]): Unit ={
//    val encodeList: List[(Int,_)] = encode(list)
//    println(s"Encoded List is : $encodeList")
//  }
//
//  def encode[A](ls: List[A]): List[(Int,_)] = {
//    P09.pack(ls).map{e=>(e.length,e.head)}
//  }
//
//}
object P10 {
  import P09.pack
  def encode[A](ls: List[A]): List[(Int, A)] =
    pack(ls) map { e => (e.length, e.head) }
}
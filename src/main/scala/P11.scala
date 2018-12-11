//object P11 {
//  def getResult(list: List[Int]): Unit ={
//    val encodeModifiedList: List[_] = encodeModified(list)
//    println(s"Modified Encoded List is : $encodeModifiedList")
//  }
//
//  def encodeModified[A](ls: List[A]): List[_] = {
//    P09.pack(ls).map{e=>{
//      if(e.length==1){
//        e.head
//      }
//      else{
//        (e.length,e.head)
//      }
//    }}
//  }
//}

object P11 {
  import P10.encode
  def encodeModified[A](ls: List[A]): List[Any] =
    encode(ls) map { t => if (t._1 == 1) t._2 else t }

  // Just for fun, here's a more typesafe version.
  def encodeModified2[A](ls: List[A]): List[Either[A, (Int, A)]] =
    encode(ls) map { t => if (t._1 == 1) Left(t._2) else Right(t) }
}
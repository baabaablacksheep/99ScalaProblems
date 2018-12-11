object P13 {
  def getResult[A](list: List[(Int,A)]): Unit ={
    val lengthDecodedList: List[A] = decode(list)
    println(s"Decoded List is : $lengthDecodedList")
  }

  def decode[A](res: List[A],rem: List[(Int,A)]): List[A] = rem match{
    case Nil => res
    case h::tail => {
      if(h._1>0){
        decode(res:+h._2,(h._1-1,h._2)::tail)
      }
      else{
        decode(res,tail)
      }
    }
  }

  def decode[A](ls: List[(Int, A)]): List[A] = {
    ls.flatMap{ e => List.fill(e._1)(e._2) }
  }
}

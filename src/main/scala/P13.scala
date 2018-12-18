object P13 {

  def getResult[A](list: List[A]): Unit ={
    val lengthEncodedList: List[(Int,A)] = encodeDirect(list)
    println(s"Decoded List is : $lengthEncodedList")
  }

  def encodeDirect[A](list: List[A]): List[(Int,A)] = {
    if(list.isEmpty){
      Nil
    }
    else{
      val (encoded,next) =list.span{_ == list.head}
      (encoded.length,encoded.head) :: encodeDirect(next)
    }
  }


}

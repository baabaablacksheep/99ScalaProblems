
object P16 {

  def getResult[A](n: Int, list: List[A]): Unit = {
    val NdroppedList: List[A] = dropTailRecursive(n,list)
    println(s"N Dropped List : $NdroppedList")
  }

  def dropN[A](n: Int, list: List[A]): List[A] = {
    def dropR(c:Int, rem:List[A]): List[A] = (c,rem) match{
      case (_,Nil) => Nil
      case (1,h::tail) => dropR(n,tail)
      case (_,h::tail) => h::dropR(c-1,tail)
    }
    dropR(n,list)
  }

  def dropTailRecursive[A](n: Int, list: List[A]): List[A] ={
    def dropR(c:Int, rem:List[A], res:List[A]): List[A] = (c,rem) match{
      case (_,Nil) => res.reverse
      case (1,_::tail) => dropR(n,tail,res)
      case (_,h::tail) => h::dropR(c-1,tail,res)
    }
    dropR(n,list,Nil)
  }
  //ZipWithIndex
//  def dropN[A](n: Int, list: List[A]): List[A] ={
//    list.zipWithIndex.filter(v=>(v._2+1)%n!=0).map(_._1)
//  }

//  def dropN[A](n: Int,list: List[A]): List[Any]={
//    var tempInt: Int=1
//    list.flatMap(x=>{
//      if(tempInt%n==0){tempInt+=1;Nil}
//      else {tempInt+=1;List(x)}
//    }
//    )
//  }
}
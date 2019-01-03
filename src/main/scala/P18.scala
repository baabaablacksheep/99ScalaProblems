
object P18 {

  def getResult[A](start: Int, end: Int, list: List[A]): Unit = {
    val slicedList: List[A] = sliceTailRecursive(start, end, list)
    println(s"N Sliced List : $slicedList")
  }

  def slice[A](start: Int, end: Int, list: List[A]): List[A] = {
    list.splitAt(end)._1.splitAt(start)._2
  }

  def sliceRecursive[A](start: Int, end: Int, list: List[A]): List[A] = {
    def sliceEnd(pointer: Int, list: List[A], res: List[A]): List[A] = (pointer, list) match {
      case ( _, Nil) => res
      case(p,h::tail)=> {
        if(p>=start){
          if(p<end){
          sliceEnd(p+1,tail,res:+h)
          }
          else{
            res
          }
        }
        else{
            sliceEnd(p+1,tail,res)
          }
        }
    }
    sliceEnd(0,list,List())
  }

  // Tail recursive, using pattern matching.
  def sliceTailRecursive[A](start: Int, end: Int, ls: List[A]): List[A] = {
    def sliceR(count: Int, curList: List[A], result: List[A]): List[A] =
      (count, curList) match {
        case (_, Nil)                     => result.reverse
        case (c, _ :: _) if end <= c   => result.reverse
        case (c, h :: tail) if start <= c => sliceR(c + 1, tail, h :: result)
        case (c, _ :: tail)               => sliceR(c + 1, tail, result)
      }
    sliceR(0, ls, Nil)
  }

}
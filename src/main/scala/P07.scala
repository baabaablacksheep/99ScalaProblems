object P07 {
  def getResult(list: List[Any]): Unit ={
    val flattenedList : List[Any] = flatten(list)
    println(s"Flattened List : $flattenedList")
  }

 def flatten(list: List[Any]) : List[Any] = {

   def _flatten(res: List[Any], rem: List[Any]): List[Any] = rem match{
     case Nil => res
     case (h:List[_])::Nil => _flatten(res,h)
     case (h:List[_])::tail => _flatten(res,h:::tail)
     case elem::tail => _flatten(res:::List(elem),tail)
   }
   _flatten(List(),list)
 }

  //This is Also Correct Using FlatMap
//  def flatten(list: List[Any]): List [Any] = list.flatMap{
//      case l:List[_]=> flatten(l)
//      case elem => List(elem)
//  }

}

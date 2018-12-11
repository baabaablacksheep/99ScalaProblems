object P09 {
  def getResult(list: List[Int]): Unit ={
    val sublistedList: List[List[Int]] = pack(list)
    println(s"Sublisted List is : $sublistedList")
  }

//  def subLister(list: List[Int]): List[List[Int]] ={
//
//    var currentVal=list(0)
//    var tempList = List.empty[Int]
//    var mainList = List.empty[List[Int]]
//    var ii=0
//    while(ii<list.length){
//      if(currentVal.equals(list(ii))){
//        tempList:+=list(ii)
//      }
//      else{
//        mainList:+=tempList
//        tempList=List.empty[Int]
//        currentVal=list(ii)
//        tempList:+=list(ii)
//      }
//      ii+=1
//    }
//    mainList:+=tempList
//    mainList
//
//  }

//  def subLister(res:List[List[Int]], tmpList:List[Int], rem:List[Int]): List[List[Int]] = rem match{
//    case Nil => res
//    case h::tail => {
//      if(tmpList.isEmpty){
//        subLister(res,tmpList:+h,tail)
//      }
//      else if(tmpList.last==h){
//        subLister(res,tmpList:+h,tail)
//      }
//      else{
//        subLister(res:+tmpList,List(h),tail)
//      }
//    }
//  }

  //Given Solution
  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List(packed)
      else packed :: pack(next)
    }
  }

}

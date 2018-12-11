object AppRunner extends App{

  //For The List Tutorial Part
  val myList: List[Int] = List(1,1,2,2,2,3,4,2,3,4,8,9,9,9,10)

  //palindromeList
  val palList: List[Int] = List(1, 2, 3, 2, 1)

  //MultiStructured List
  val multiStructList: List[Any] = List(List(1, 1), 2, List(3, List(5, 8)), 5, 6)

  //Length Encoded List
  val lengthEncodedList: List[(Int,Int)] = List((1, 1), (2,4), (5, 8), (3,4), (3,10))

  //Results of the Problems
//  print("P01 Result =>    ")
//  P01.getResult(myList)
//  print("P02 Result =>    ")
//  P02.getResult(myList)
//  print("P03 Result =>    ")
//  P03.getResult(myList,5)
//  print("P04 Result =>    ")
//  P04.getResult(myList)
//  print("P05 Result =>    ")
//  P05.getResult(myList)
//  print("P06 Result =>    ")
//  P06.getResult(myList)
//  print("P06 Result =>    ")
//  P06.getResult(palList)
//  print("P07 Result =>    ")
//  P07.getResult(multiStructList)
//  print("P08 Result =>    ")
//  P08.getResult(myList)
//  print("P09 Result =>    ")
//  P09.getResult(myList)
//  print("P10 Result =>    ")
//  P10.getResult(myList)
//  print("P11 Result =>    ")
//  P11.encodeModified2(myList)
//  print("P12 Result =>    ")
//  P12.getResult(lengthEncodedList)
  print("P13 Result =>    ")
  P13.getResult(lengthEncodedList)
}

object P06 {
  def getResult(list: List[Int]): Unit ={
    val isPalList: Boolean = isPalindrome(list)
    println(s"The List is a Palindrome : $isPalList")
  }
  def isPalindrome(list: List[Int]): Boolean ={
    val reversedList: List[Int] = list.reverse
    list.equals(reversedList)
  }

}

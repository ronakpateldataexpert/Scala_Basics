object Q4 {
  def main(args:Array[String]):Unit= {

//    4. Write a java program that performs the following tasks.
//    a. Store a number in a variable
//    b. If value is not in range (100-1000) prints wrong number else follows the steps
//    c. Check even or odd
//    d. If even divide the number by 3 and print the remainder
//    e. If odd divide the number by 2 and print the remainder.
    print("Enter num :")
    val num= scala.io.StdIn.readDouble()
    if (num >=100 && num<=1000)
    {
      println(s" number $num is not in range of 100-1000 so number which you have entered is a wrong number")
    }
    else {
        if (num%2 == 0)
            {
             println(s"  ")
             val rem = num % 3
             println(s"number $num is even number and when divided by 3  remainder left is $rem")
            }
        else {
              val rem1=num % 2
              println(s" number $num is odd number  and when divided by 2 remainder left is $rem1")
              }
          }
  }
}

object Q8 {
  def main(args:Array[String]):Unit= {
//8. Write a program to print all numbers which are divisible by 11 from 250 to 550.
    print("enter num1 starting range:")
    val num1 = scala.io.StdIn.readInt()
    print("enter num1 ending range:")
    val num2 = scala.io.StdIn.readInt()
    for (i <- num1 to num2) {
      if (i % 11 == 0) {
        println(s"$i is divisible by 11 in the range from $num1 to $num2")
      }
    }
  }
}

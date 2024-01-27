object Q9 {
  def main(args: Array[String]): Unit = {

    //9. Write a program to sum all the numbers from 56 to 153.
    val num1 = 56
    val num2 = 153
    var sum = 0
    for (i <- num1 to num2) {
      sum = sum + i
    }
    println(s"sumation from $num1 to $num2 is $sum")
  }
}

object Q10 {
  def main(args:Array[String]):Unit= {
//10. Write a program to print all even numbers in range 700 to 900.
    val n1 = 700
    val n2 = 900
    for (num <- n1 to n2) {
      if (num%2==0) {
        println(s"$num is an even number")
      }
    }
  }
}

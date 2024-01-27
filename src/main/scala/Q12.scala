object Q12 {
  def main(args:Array[String]):Unit= {
//12. Write a Program to print the count of the even numbers between the given range?
    print("enter  number 1:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 :")
    val n2 = scala.io.StdIn.readInt()
    var counter = 0
    for (num <- n1 to n2) {
      if (num % 2 == 0) {
        counter = counter + 1
      }
    }
    println(s"total count of even numbers between $n1 and $n2 is: $counter")
  }
}

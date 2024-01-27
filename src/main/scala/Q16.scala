object Q16 {

  def main(args:Array[String]):Unit= {
  //16. Write a program to sum all even numbers between 382 and 582.
  val n1= 382
    val n2 = 582
    var sum = 0
    for (i <- n1 to n2 by 2) {
      if (i % 2 == 0) {
        sum = i+sum
      }
    }
    println(s"sum of all even numbers between $n1 to $n2 is: $sum")

  }
}

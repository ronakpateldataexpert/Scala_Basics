object Q18 {

  //18. Write a program to find the average of 24,26,28,.....100.
  def main(args:Array[String]):Unit= {
    print("enter  number 1:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 :")
    val n2 = scala.io.StdIn.readInt()
    var counter = 0
    var sum=0

    for (num <- n1 to n2 by 2) {
      sum = sum+num
      counter  =counter+ 1
    }

  println(s"sum is $sum")
    val x=sum/counter
println(s"avg is $x")

}
}

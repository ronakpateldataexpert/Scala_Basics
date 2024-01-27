object Q19 {

  def main(args:Array[String]):Unit= {
  //19. Write programs to sum of the following Series. 52 + 62 + 72
  //+..........+1022.
    print("enter  number 1 starting series:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 ending last number of series:")
    val n2 = scala.io.StdIn.readInt()
    var diff = 10
    var sum=0
    print("series of number is below")
    for (num <- n1 to n2 by diff) {
      sum = sum+num
      print(s" $num ")
    }
    println(s"sum of above series is : $sum")
}

}

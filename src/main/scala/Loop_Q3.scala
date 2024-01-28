object Loop_Q3 {
  def main(args: Array[String]): Unit = {
    //3)Calculate the sum of all numbers from 1 to 50 using a "for" loop.
    var sum=0
    for(i<-1 to 50) {
      println(i)
      sum = sum+i
    }
    println(s"sum of total 1 to 50 is $sum")
  }
}

object Q22 {

  def main(args:Array[String]):Unit= {
//22. Write programs to print the following series. 100,200,300........10000
    print("enter  number 1:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 :")
    val n2 = scala.io.StdIn.readInt()
    var diff = 100
    for (num <- n1 to n2 by diff) {
      println(num)
    }
  }

}

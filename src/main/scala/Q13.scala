object Q13 {
  def main(args:Array[String]):Unit= {
//13. Write a program to print alternate even numbers from 20 to 140. Like(20,24,28...)
    print("enter  number 1:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 :")
    val n2 = scala.io.StdIn.readInt()

    for (num <- n1 to n2  by 4) {
      print(s" $num ")
    }
  }
}

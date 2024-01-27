object Q3 {
  def main(args:Array[String]):Unit= {
    //3. Declare and initialize 3 three variable and print the biggest number.
    print("Enter num1 :")
    val a1= scala.io.StdIn.readDouble()
    print("Enter num2 :")
    val a2= scala.io.StdIn.readDouble()
    print("Enter num2 :")
    val a3= scala.io.StdIn.readDouble()
    val num = List(a1,a2,a3).max
    println(s" Biggest number from $a1, $a2, $a3 is $num ")

  }
}

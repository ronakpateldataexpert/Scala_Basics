object Q2 {
  def main(args:Array[String]):Unit= {
    //2. Write a program to covert temperature from degree C to F. (Input 80C) Logic - (80°C × 9/5) + 32 = 176°F
    print("enter the temp value in C : ")
    val c = scala.io.StdIn.readDouble()
    val f = (c * (9/5)) + 32
    println(s" $c degree in celsius = $f in Fahrenheit")
  }
}

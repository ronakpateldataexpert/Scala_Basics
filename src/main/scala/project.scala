object project {
  def main(args:Array[String]):Unit={
//    val a=20;
//    a=30;
//  var b=10;
//    b=5;
//    println(b);
//
//    print("enter the f value:");
//    var f =scala.io.StdIn.readInt();
//    println( f)

//    def mango(a:Int,b:Int):Int = {
//      var sum =a+b
//      sum
//    }
//  val op=mango(10,20)
//    println(op)

//    val a=10.2;
//    val b:Double=23
//    println(b)
//
//    val c:Float=10.2f
//    println(c)
//Q1 Write a program to convert kg to g
    print("Enter value in kg  : ")
    val kg = scala.io.StdIn.readDouble()
    val grams = kg * 1000
    println(s" $kg kg weight is equal to $grams in grams " )
//Q2 Write a program to covert temperature from degree C to F
    print("Enter temp in Celsius : ")
    val celsius = scala.io.StdIn.readDouble()
    val f = celsius * 9/5 + 32
    println(s" $celsius degree = $f in Fahrenheit")

// Q3 Declare and initialize 3 three variable and print the biggest number
    val a1=10
    val a2=20
    val a3=30
    val num = List(a1,a2,a3).max
    println(s" Biggest number from $a1, $a2, $a3 is $num ")

  var k =10 to 1 by -11

    for (i<-k)
      {
        println(i)
      }
      println("hello")

    println("test2")
    println("test3")






  }
}

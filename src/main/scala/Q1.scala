object Q1 {
  def main(args:Array[String]):Unit= {
    //1. Write a program to convert kg to g. (Input 56kg print in grams)
    print("please enter the weight in kg : ")
    val kg = scala.io.StdIn.readDouble()
    val grams = kg * 1000
    println(s" $kg kg weight is equal to $grams in grams " )
  }
  }


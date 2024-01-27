object Q11 {

  def main(args: Array[String]): Unit = {

//11. Write a program to print all odd numbers from 251 to 51. like (251,249,...51)
val n1 = 251
    val n2 = 51
    for (num <- n1 to n2 by -1 ) {
      if (num % 2 != 0) {
        println(s"$num is an odd number")}}

  }


}

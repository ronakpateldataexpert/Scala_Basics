object Pattern_1 {
  def main(args: Array[String]): Unit = {

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    var num1 = 1
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print(num1 + " ")
        num1 = num1 + 1
      }
      println()
    }
    println()

    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5

    var num2 = 1
    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print(i + " ")

      }
      println()
    }
    println()

    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print(j + " ")
      }
      println()
    }
    println()

    // 5 4 3 2 1
    // 4 3 2 1
    // 3 2 1
    // 2 1
    // 1
    for (i <- 5 to 1 by -1) {
      for (j <- i to 1 by -1) {
        print(j +" ")
      }
      println()

    }





  }
}

object Q5 {
  //5. Declare & initialize a number. Check whether the number is in range 0-100 or not.
  // If not in range print invalid input.
  // Else – if the number is in range 90-100 then print Super Smart,
  // 80-90 print Smart,70-80 print smart enough,

  def main(args: Array[String]): Unit = {
    print(" Enter num: ")
    val num= scala.io.StdIn.readDouble()

    if (num >= 0 && num <= 100)
    {
      if (num >= 90 && num <= 100) {
        println("Super Smart")
      } else if (num >= 80 && num < 90) {
        println("Smart")
      } else if (num >= 70 && num < 80) {
        println("Smart enough")
      }
    }
    else {
      println("invalid input")
    }
  }
}

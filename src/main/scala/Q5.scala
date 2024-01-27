object Q5 {
  //5. Declare & initialize a number. Check whether the number is in range 0-100 or not.
  // If not in range print invalid input.
  // Else – if the number is in range 90-100 then print Super Smart,
  // 80-90 print Smart,70-80 print smart enough,
  //60-70 print just smart, 35-60 print no smart, 0-35 print dump.


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
        println("Smart  enough")
      } else if (num >= 35 && num < 60) {
        println("No Smart")
      } else if (num >= 0 && num < 35) {
        println("dump")
      }
    }
    else {
      println("invalid input")
    }
  }
}

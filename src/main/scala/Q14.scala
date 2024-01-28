object Q14 {
  def main(args:Array[String]):Unit= {
//14. Write a program to print alternate even numbers from 20 to 140. Like
    //(22,26,30...)

    print("enter  number 1:")
    val n1 = scala.io.StdIn.readInt()
    print("enter  number 2 :")
    val n2 = scala.io.StdIn.readInt()

    //to start the number from given by user
    var i=n1
    while(i<=n2){
      if(i%2==0){
        i=i+2
        println(i)}
      i=i+1
    }


  }
}

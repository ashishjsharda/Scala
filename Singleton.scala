class Point{
  var x=10
  var y=20
  def show(a:Int,b:Int): Unit ={
    x=a+x
    y=y+b

  }
}
object Singleton {

  def main(args: Array[String]): Unit = {
    val point=new Point()
    point.show(10,40)
    printPoints
    def printPoints: Unit ={
      println("Value of x is "+point.x)
      println("Value of y is "+point.y)
    }
  }

}

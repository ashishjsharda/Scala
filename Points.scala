class Point(xc:Int,yc:Int){
  var x:Int=xc
  var y:Int=yc

  def move(dx:Int,dy:Int): Unit ={
    x=x+dx
    y=y+dy
    println("Point x location is ",x)
    println("Point y location is ",y)
  }

}
object Points {
  def main(args: Array[String]): Unit = {

    val pt=new Point(10,20)
    pt.move(20,30)
  }

}

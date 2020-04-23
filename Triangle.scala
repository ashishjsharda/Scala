

class Area(base:Int,height:Int){
  var b:Int=base
  var h:Int=height
  def calculate(): Unit ={

    println("Area is "+b*h)

  }
}
object Triangle {
  def main(args: Array[String]): Unit = {

    val triangle=new Area(10,20)
    triangle.calculate()
  }

}

class Hello{
  def show(){
    println("Hello World")
  }
}
object Classes {
  def main(args: Array[String]): Unit = {

    val h=new Hello()
    h.show()
  }

}

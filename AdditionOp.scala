class  Add(x:Int,y:Int){

  var a=x
  var b=y

  def operation: Unit ={
    a=a+10
    b=b+10
    println(" Value of x after adding 10 is " +a +" Value of b after adding 10 is  "+b)

  }
}
object AdditionOp {
  def main(args: Array[String]): Unit = {
    var myvar=10
    var myVal="Hello Scala"
    println("Value of myvar is " +myvar +"   Value of myVal is  " +myVal)
    val add=new Add(10,20)
    println(add.operation)
  }

}

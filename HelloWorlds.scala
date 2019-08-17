import java.io._

/**
  * Getting Started with Scala
  * @author asharda
  */
class HelloWorld {

  def showHelloWorld(): Unit =
  {
    print("Hello World");
  }

}

object Demo
{
  def main(args: Array[String]): Unit = {
    var h=new HelloWorld();
    h.showHelloWorld()
  }
}

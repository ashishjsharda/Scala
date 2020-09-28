import scala.collection.mutable.ArrayBuffer

/**
 * Using Arrays
 * @author ashish
 */
object Sub {

  def main(args: Array[String]): Unit = {

    var arr=Array(10,2,4,5,1,6)
    for(i<-arr) {
      println(i)
    }
      var total=0
      //Add all elements of the array
      for(i<-0 to arr.length-1) {
        total=total+arr(i)
      }
      println("Total is ",total)



  }

}

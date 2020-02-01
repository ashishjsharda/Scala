object ArrayDemo {
  def main(args: Array[String]): Unit = {
    var myList=Array(1,2,3,4,5)
    var mytemp=0
    for (x<-myList){

      mytemp=mytemp+x
      println(mytemp)
      println(x)
    }
  }

}

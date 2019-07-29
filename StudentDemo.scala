
import java.io._
class Students(var name:String,var rollno:Int) {

	var n:String=name;
var r:Int=rollno;
def getStudentData()
{
	println("Name seen is "+ n);
	println("Roll No seen is " +r);
}
}

object StudentDemo
{
	def main(args:Array[String])
	{
		val s=new Students("Sai",100);
		s.getStudentData();

	}
}

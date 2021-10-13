import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

//Testing perform by using two different methods
//Method-1
 class AttendanceServiceTest extends AnyFunSuite with Employee {
   override var empID: String =""
   override var firstName: String =""
   override var lastName: String =""
   override var salary: Double =0
   val testAttend: AttendanceService = new AttendanceService()
   test("Testing the valid time"){
     assert(testAttend.getAttendanceService("Shyam",9.45,18.45)==9)
     assert(testAttend.getAttendanceService("Rohit",9.00,18.00)==9)
     assert(testAttend.getAttendanceService("Divya",10.00,19.00)==9)
 }
//Method-2
   class AttendanceServiceTest2 extends AnyFlatSpec{
     val newtestAttend:AttendanceService=new AttendanceService()
     "Attendance Service" should "give the proper working hours" in{
       assert(newtestAttend.getAttendanceService("Shivam")==9)
       assert(newtestAttend.getAttendanceService("Sikha")==9)
       assert(newtestAttend.getAttendanceService("Rahul")==9)
       assert(newtestAttend.getAttendanceService("Deepu")==9)}
   }
}
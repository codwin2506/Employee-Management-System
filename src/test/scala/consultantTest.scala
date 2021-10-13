import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

//testing using two different methods:

//Method-1
class consultantTest extends AnyFunSuite{
  val newConsultant:consultant=new consultant()
  test("Valid consultant or not"){
    assert(newConsultant.consultant("001","Ratan","Singh",15000)=="CONS001")
    assert(newConsultant.consultant("123","Abhishek","Dwivedi",15000)=="CONS123")
    assert(newConsultant.consultant("222","Mohit","Singh",15000)=="CONS222")

  }

  //Method-2
class consultantTest extends AnyFlatSpec{
  val newConsultant2:consultant=new consultant()
  "Consultant" should "give" in
  assert(newConsultant.consultant("011","Rahul","Tiwari",15000)=="CONS011")
  assert(newConsultant.consultant("100","Nitish","Bhardwaj",15000)=="CONS100")

}

}

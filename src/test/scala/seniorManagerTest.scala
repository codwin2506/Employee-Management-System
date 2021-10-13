import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

//Testing perform by using two different methods
//Method-1
class seniorManagerTest extends AnyFunSuite{
  val newSrManager:seniorManager=new seniorManager()
  test("Valid Senior Manager or not by their id"){
    assert(newSrManager.seniorManager("001","Ratan","Singh",120000)=="SRMA001")
    assert(newSrManager.seniorManager("123","Shyam","Singh",120000)=="SRMA123")
    assert(newSrManager.seniorManager("200","Arpit","Tyagi",180000)=="SRMA200")
  }

//Method-2
class seniorManagerTest2 extends AnyFlatSpec{
  val newSrManager2:seniorManager=new seniorManager()
  "Senior Manager" should "give the correct ID's" in
    assert(newSrManager2.seniorManager("011","Rahul","Tiwari",150000)=="SRMA011")
    assert(newSrManager2.seniorManager("100","Nitish","Bhardwaj",150000)=="SRMA100")
    assert(newSrManager2.seniorManager("200","Arpit","Tyagi",80000)=="SRMA200")
}
}
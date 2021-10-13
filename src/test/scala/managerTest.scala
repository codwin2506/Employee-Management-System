import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

//Testing perform by using two different methods
//Method-1
class managerTest extends AnyFunSuite{
  val newManager:manager=new manager()
  test("Valid Manager or not"){
    assert(newManager.manager("001","Ratan","Singh",80000)=="MANA001")
    assert(newManager.manager("123","Shyam","Singh",80000)=="MANA123")

  }

  //Method-2
  class managerTest2 extends AnyFlatSpec {
    val newConsultant2: manager = new manager()
    "Manager " should "give the correct ID's" in {
      assert(newConsultant2.manager("011", "Rahul", "Tiwari", 150000) == "MANA011")
      assert(newConsultant2.manager("100", "Nitish", "Bhardwaj", 150000) == "MANA100")
      assert(newConsultant2.manager("200", "Arpit", "Tyagi", 80000) == "MANA200")
    }
  }
}
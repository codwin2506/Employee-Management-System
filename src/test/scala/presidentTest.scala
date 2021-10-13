import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.funsuite.AnyFunSuite

//Testing perform by using two different methods
//Method-1
class presidentTest extends AnyFunSuite{
  val newPresident:president=new president()
  test("Valid President or not"){
    assert(newPresident.president("001","Ratan","Singh",120000)=="POTC001")
    assert(newPresident.president("123","Shyam","Singh",120000)=="POTC123")
    assert(newPresident.president("200","Arpit","Tyagi",180000)=="POTC200")
  }

  //Method-2
  class presidentTest2 extends AnyFlatSpec {
    val newPresident2: president = new president()
    "President" should "give the correct ID's" in
      assert(newPresident2.president("011", "Rahul", "Tiwari", 150000) == "POTC011")
    assert(newPresident2.president("100", "Nitish", "Bhardwaj", 150000) == "POTC100")
    assert(newPresident2.president("200", "Arpit", "Tyagi", 80000) == "POTC200")
  }
}

class consultant extends Employee {
  override var empID: String =""
  override var firstName: String =""
  override var lastName: String =""
  override var salary: Double =0.0

  private def setCONS(id:String):String={
    val prefID="CONS"+id
    prefID
  }

  def consultant( id: String, fname: String,lname: String,salary: Double): String = {
    val setID: String =setCONS(id)
    setImpID(setID)
    setFirstName(fname)
    setLastName(lname)
    setEmployeeSalary(salary)
    setID
  }




}

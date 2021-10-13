class manager extends Employee {
  override var empID: String =""
  override var firstName: String =""
  override var lastName: String =""
  override var salary: Double =0.0

  private def setMANA(id:String):String={
    val prefID="MANA"+id
    prefID
  }

  def manager( id: String, fname: String,lname: String,salary: Long): String = {
    val setID: String =setMANA(id)
    setImpID(setID)
    setFirstName(fname)
    setLastName(lname)
    setEmployeeSalary(salary)
    setID
  }
}

class seniorManager extends Employee {
  override var empID: String =""
  override var firstName: String =""
  override var lastName: String =""
  override var salary: Double =0.0

  private def setSRMA(id:String):String={
    val prefID="SRMA"+id
    prefID
  }

  def seniorManager( id: String, fname: String,lname: String,salary: Double): String = {
    val setID: String =setSRMA(id)
    setImpID(setID)
    setFirstName(fname)
    setLastName(lname)
    setEmployeeSalary(salary)
    setID
  }
}

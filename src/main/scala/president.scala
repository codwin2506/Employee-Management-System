class president extends Employee {
  override var empID: String =""
  override var firstName: String =""
  override var lastName: String =""
  override var salary: Double =0.0

  private def setPOTC(id:String):String={
    val prefID="POTC"+id
    prefID
  }

  def president( id: String, fname: String,lname: String,salary: Long): String = {
    val setID: String =setPOTC(id)
    setImpID(setID)
    setFirstName(fname)
    setLastName(lname)
    setEmployeeSalary(salary)
    setID
  }
}

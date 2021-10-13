trait Employee {
  var empID:String
  var firstName:String
  var lastName:String
  var salary:Double


  def setImpID(EmpID:String):Unit={
    empID=EmpID
  }
  def setFirstName(first:String):Unit={
    this.firstName=first
  }
  def setLastName(second:String):Unit={
    this.lastName=second
  }
  def setEmployeeSalary(empSalary:Double):Unit={
    salary=empSalary
  }
  def getImpID:String={
    empID
  }
  def getFirstName:String={
    firstName
  }
  def getLastName:String={
    lastName
  }
  def getEmployeeSalary(sal:Double):Double={
    salary
  }

}

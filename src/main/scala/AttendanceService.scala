class AttendanceService {
  def getAttendanceService(EmpName:String,Start_time:Double,End_Time:Double): Double ={
    val total_time=End_Time- Start_time
    total_time
  }
  def getAttendanceService(EmpName:String): Double ={
    val start_Time=9.45
    val end_Time=18.45
    val total_time=end_Time-start_Time
    total_time
  }

}

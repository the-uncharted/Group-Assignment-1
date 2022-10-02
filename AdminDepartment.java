package Services;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String deptName = "Admin Department";
		return deptName;
		}
	
	public String getTodaysWork() {
		String getWork = "Complete your documents Submission";
		return getWork;
		}
	
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
		}
	public String isTodayAHoliday() {
		String isHoliday = "Today is not a holiday";
		return isHoliday;
		}

}

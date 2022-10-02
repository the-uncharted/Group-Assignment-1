package Services;

public class TechDepartment extends SuperDepartment{
	public String departmentName() {
		String deptName = "Tech Department";
		return deptName;
		}
	
	public String getTodaysWork() {
		String getWork = "Complete coding of Module 1";
		return getWork;
		}
	
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
		}
	
	public String getTechStackInformation() {
		String getStackInfo = " Core Java";
		return getStackInfo;
		}
	public String isTodayAHoliday() {
		String isHoliday = "Today is not a holiday";
		return isHoliday;
		}

}

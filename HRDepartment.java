package Services;

public class HRDepartment  extends SuperDepartment {
	public String departmentName() {
		String deptName = "HR Department";
		return deptName;
		}
	
	public String getTodaysWork() {
		String getWork = "Fill today’s timesheet and mark your attendance";
		return getWork;
		}
	
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
		}
	
	public String doActivity() {
		String activity = "team Lunch";
		return activity;
		}
	public String isTodayAHoliday() {
		String isHoliday = "Today is not a holiday";
		return isHoliday;
		}
}


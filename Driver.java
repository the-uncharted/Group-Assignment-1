package Application;

import Services.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		AdminDepartment admin = new AdminDepartment();
		System.out.println(" Welcome to "+ admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		HRDepartment hr = new HRDepartment();
		System.out.println(" Welcome to "+ hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		System.out.println();
		
		TechDepartment tech = new TechDepartment();
		System.out.println(" Welcome to "+ tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
		
	}

}

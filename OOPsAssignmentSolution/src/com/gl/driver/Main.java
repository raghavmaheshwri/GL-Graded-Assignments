package com.gl.driver;

import com.gl.service.AdminDepartment;
import com.gl.service.HrDepartment;
import com.gl.service.TechDepartment;

public class Main {

	// Create objects of HrDepartment, TechDepartment, AdminDepartment
	private static final AdminDepartment adminDept = new AdminDepartment();
	private static final HrDepartment hrDept = new HrDepartment();
	private static final TechDepartment techDept = new TechDepartment();

	public static void main(String[] args) {

		// Welcome Text
		final String Welcome = "Welcome to ";

		// To Print Admin Department Statement
		System.out.println(Welcome + adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println();

		// To Print Hr Department Statement
		System.out.println(Welcome + hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println();

		// To Print Tech Department Statement
		System.out.println(Welcome + techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		System.out.println();

	}
}

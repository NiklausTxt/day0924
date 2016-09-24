package com.day0924.practice4;

import java.util.List;


public class Test {
	public static void main(String[] args) {
		HR hr = new HR();
		Employee emp = new Employee("sjdjdj", "2323", 1232);
		hr.enrollEmployee(emp);
		hr.resignEmployee("15");
		List<Employee> list = hr.getEmployees();
		
		for(Employee e:list){
			System.out.println(e.toString());
		}
		
		Employee employee = hr.getTopSalaryEmployee();
		System.out.println("=================================================");
		System.out.println(employee.toString());
		System.out.println("=================================================");
		System.out.println(hr.isOurEmployee(emp));
		
		
		System.out.println("=================================================");
		hr.getTop10SalaryEmployees();
	}
	
}

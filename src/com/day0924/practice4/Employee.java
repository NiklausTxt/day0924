package com.day0924.practice4;

public class Employee {
	private String name;
	private String ID;
	private int salary;
	
	public Employee(String name, String ID, int salary) {
		this.ID=ID;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "员工姓名："+getName()+",员工ID："+getID()+",员工工资："+getSalary();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Employee)){
			return false;
		}
		Employee employee = (Employee) obj;
		return employee.ID==this.ID && employee.name==this.name && employee.salary==this.salary;
	}
}

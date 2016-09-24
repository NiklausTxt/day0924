package com.day0924.practice5;

import java.util.HashSet;
import java.util.Set;

public class Worker {
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	private double salary;
	
	public Worker(String name, int age, double salary) {
		this.setAge(age);
		this.name=name;
		this.setSalary(salary);
	}
	
	public void work(){
		System.out.println(name+"开始工作。。。");
		System.out.println(name+"完成工作。。。");
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Worker)) return false;
		Worker worker = (Worker)obj;
		return worker.age==this.age && worker.name == this.name &&
				worker.salary==this.salary;
	}
	

	@Override
	public int hashCode() {
		return this.name.hashCode()+Integer.hashCode(age)+Double.hashCode(salary);
	}

}

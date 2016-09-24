package com.day0924.practice8;

public class Worker implements Comparable<Worker>{
	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Worker(String name, int age, double salary) {
		this.setAge(age);
		this.name = name;
		this.setSalary(salary);
	}

	public void work() {
		System.out.println(name + "开始工作。。。");
		System.out.println(name + "完成工作。。。");
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
		if (!(obj instanceof Worker))
			return false;
		Worker worker = (Worker) obj;
		return worker.age == this.age && worker.name == this.name && worker.salary == this.salary;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + Integer.hashCode(age) + Double.hashCode(salary);
	}

	@Override
	public int compareTo(Worker o) {
		if(o.age!=this.age){
			return o.age-this.age;
		}else if(o.salary!=this.salary){
			return (int) (o.salary-this.salary);
		}else{
			return o.name.compareTo(this.name);
		}
	}
}

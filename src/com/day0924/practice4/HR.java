package com.day0924.practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HR {
	private List<Employee> list = new ArrayList<>();
	public HR() {
		for(int i=0;i<20;i++){
			int salary = (int)(Math.random()*1000);
			String String = "Ô±¹¤"+(i+1);
			String idString = ""+(i+1);
			Employee e = new Employee(String,idString,salary);
			list.add(i, e);
		}
	}
	public List<Employee> getEmployees(){
		return list;
	}
	
	public Employee getTopSalaryEmployee(){
		int max=0;
		for(Employee e:list){
			if(e.getSalary()>max){
				max=e.getSalary();
			}
		}
		for(Employee e:list){
			if(e.getSalary()==max){
				return e;
			}
		}
		return null;
	}
	
	public void enrollEmployee(Employee e){
		this.list.add(e);
	}
	
	public void resignEmployee(String employeeID){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getID().equals(employeeID)){
				list.remove(i);
			}
			
		}
	}
	
	public boolean isOurEmployee(Employee employee){
		for(int i=0;i<list.size();i++){
			if(list.get(i).equals(employee)){
				return true;
			}
			
		}
		return false;
	}
	
	public void getTop10SalaryEmployees(){
		Comparator<Employee> comparator = new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2){
				if(e1.getSalary()!=e2.getSalary()){
					return e2.getSalary()-e1.getSalary();
				}else if(e1.getID().equals(e2.getID())){
					return e2.getID().compareTo(e1.getID());
				}else{
					return e2.getName().compareTo(e1.getName());
				}
				
			}
		};
		
		Collections.sort(this.list, comparator);
		for(int i = 0;i<10;i++){
			System.out.println(list.get(i).toString());
		}
	}
	
}

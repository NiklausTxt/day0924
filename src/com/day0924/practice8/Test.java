package com.day0924.practice8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Worker> set =new TreeSet<>();
		
		Worker w1=new Worker("张三", 180, 3000);
		Worker w2=new Worker("李四", 25, 300);
		Worker w3=new Worker("王五", 22, 3200);
		Worker w4=new Worker("赵六", 24, 3300);
		
		Worker w5=new Worker("张三", 18, 3000);
		Worker w6=new Worker("张三", 18, 3000);
		set.add(w1);
		set.add(w2);
		set.add(w3);
		set.add(w4);
		set.add(w5);
		set.add(w6);
		for(Worker worker:set){
			System.out.println("工人姓名："+worker.getName()+",工人年龄："+worker.getAge()+",工人工资："+worker.getSalary());
		}
		
//		list.add(w1);
//		list.add(w2);
//		list.add(w3);
//		list.add(1,w4);
//		for(int i=0; i<list.size();i++){
//			if(list.get(i).getName().equals("王五")){
//				list.remove(i);
//			}
//		}
//		for(Worker worker : list){
//			System.out.println("工人姓名："+worker.getName()+",工人年龄："+worker.getAge()+",工人工资："+worker.getSalary());
//		}
//		
//		Iterator<Worker> it = list.iterator();
//		while(it.hasNext()){
//			Worker worker = it.next();
//			worker.work();
//		}

	}

}

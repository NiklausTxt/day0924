package com.day0924.practice10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CourseTeacher {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Tom", "CoreJava");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Unix");
		map.put("Kevin", "JSP");
		map.put("Lucy", "JSP");
		
		map.put("Allen", "JDBC");
		map.put("Lucy", "CoreJava");
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for(Entry<String, String> entry:entries){
			System.out.println("��ʦ��"+entry.getKey()+",�γ̣�"+entry.getValue());
		}
		System.out.println("=============================");
		System.out.println("���н�JSP����ʦ��");
		for(Entry<String, String> entry:map.entrySet()){
			if(entry.getValue().equals("JSP")){
				System.out.println("��ʦ��"+entry.getKey()+",�γ̣�"+entry.getValue());
			}
		}
		
	}
}

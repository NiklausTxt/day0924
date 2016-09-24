package com.day0924.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("С��");
		list.add("С��");
		list.add(0, "���");
		System.out.println("=======================");
		print(list);
		
		System.out.println("=======================");
		System.out.println(list.size());
		
		
		list.set(3, "233");
		System.out.println("=======================");
		print(list);
		
		System.out.println("=======================");
		System.out.println(list.indexOf("С��"));
		
		System.out.println("=======================");
		list.remove(4);
		print(list);
		
		
	}

	public static void print(List<String> list){
		for(String s : list){
			System.out.println(s);
		}
	}
}

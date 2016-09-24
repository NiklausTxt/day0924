package com.day0924.practice;


import java.util.ArrayList;
import java.util.List;

import com.sun.swing.internal.plaf.basic.resources.basic;

public class Test3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(5);
//		System.out.println(list.size());
		noRepeat(list);
		for(Integer i:list){
			System.out.print(i+" ");
		}
	}
	public static List<Integer> noRepeat(List<Integer> list){
		int len = list.size();
		for(int i=1;i<len;i++){
			for(int j=0;j<i;j++){
				if(list.get(i)==list.get(j)){
					list.remove(i);
					len=list.size();
					i--;
				}
				

			}
		}
		return list;
	}
}

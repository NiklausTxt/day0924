package com.day0924.practice;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			list.add(i+1);
		}
		delete(list, 4);
		for(Integer num:list){
			System.out.print(num+", ");
		}
	}
	
	public static List<Integer> delete(List<Integer> list, int n){
		for(int i = list.size(); i>0; i--){
			if(i%n==0){
				list.remove(i-1);
			}
		}
		return list;
	}
}

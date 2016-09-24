package com.day0924.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	public static void doTimings(String type, List<Integer> list){
		for(int i = 0; i<1E5; i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		for(int i=0; i<1E5; i++){
//			list.add(i);
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println(type+"类型花费的时间是"+(end-start)+"毫秒");
	}
}

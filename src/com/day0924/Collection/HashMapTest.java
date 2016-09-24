package com.day0924.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "three");
		map.put(5, "five");
		map.put(6, "six");
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "four");
		
		map.put(4, "FOUR");
		
		
		
		
		System.out.println("Foreach±éÀú=============================");
		for(Entry<Integer, String> entry : map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		map.remove(3);
		System.out.println("µü´úÆ÷±éÀú=============================");
		Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}
}

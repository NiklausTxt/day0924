package com.day0924.practice9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2006, "意大利");
		map.put(2002, "巴西");
		map.put(1998, "法国");
		map.put(1994, "巴西");
		map.put(1990, "德国");
		map.put(1986, "阿根廷");
		map.put(1982, "意大利");
		map.put(1978, "阿根廷");
		map.put(1974, "德国");
		map.put(1970, "巴西");
		map.put(1966, "英格兰");
		map.put(1962, "巴西");
		map.put(1958, "巴西");
		map.put(1954, "德国");
		map.put(1950, "乌拉圭");
		map.put(1938, "意大利");
		map.put(1934, "意大利");
		map.put(1930, "乌拉圭");
		
		
//		System.out.println("请输入年份");
//		Scanner scanner = new Scanner(System.in);
//		int year = scanner.nextInt();
//		if(map.containsKey(year)){
//			System.out.println(year + "的世界杯冠军是："+map.get(year));
//		}else {
//			System.out.println("没有举办世界杯");
//		}
//		scanner.close();
		
		
		System.out.println("请输入国家");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int i=0;
		for(Entry<Integer, String> entry : map.entrySet()){
			if(entry.getValue().equals(str)){
				i++;
				System.out.print(entry.getKey()+" ");
			}
		}
		if(i==0){
			System.out.println("没有获得过世界杯");
		}
		scanner.close();
	}
}

package com.day0924.practice9;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2006, "�����");
		map.put(2002, "����");
		map.put(1998, "����");
		map.put(1994, "����");
		map.put(1990, "�¹�");
		map.put(1986, "����͢");
		map.put(1982, "�����");
		map.put(1978, "����͢");
		map.put(1974, "�¹�");
		map.put(1970, "����");
		map.put(1966, "Ӣ����");
		map.put(1962, "����");
		map.put(1958, "����");
		map.put(1954, "�¹�");
		map.put(1950, "������");
		map.put(1938, "�����");
		map.put(1934, "�����");
		map.put(1930, "������");
		
		
//		System.out.println("���������");
//		Scanner scanner = new Scanner(System.in);
//		int year = scanner.nextInt();
//		if(map.containsKey(year)){
//			System.out.println(year + "�����籭�ھ��ǣ�"+map.get(year));
//		}else {
//			System.out.println("û�оٰ����籭");
//		}
//		scanner.close();
		
		
		System.out.println("���������");
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
			System.out.println("û�л�ù����籭");
		}
		scanner.close();
	}
}

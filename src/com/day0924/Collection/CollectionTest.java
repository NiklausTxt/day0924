package com.day0924.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> c1;
		Collection<String> c2;
		c1 = new ArrayList<String>();
		c2 = new ArrayList<String>();
		c1.add("张三");
		c1.add("李四");
		c2.addAll(c1);
		System.out.println(c2.contains(4));
		Iterator<String> it = c1.iterator();
		while(it.hasNext()){
			String string = it.next();
			System.out.println(string);
		}
		
		for(String s : c1){
			System.out.println(s);
		}
	}
}

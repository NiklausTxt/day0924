package com.day0924.practice13;

import java.util.LinkedList;

public class MyStack {
	LinkedList<Object> list = new LinkedList<>();

	public void push(Object o) {
		list.add(o);
    }
    //��ջ
    public Object pop() {
        return list.remove();
    }
    //�鿴ջ��Ԫ��
    public Object peek() {
        return list.getFirst();
    }
    //�ж�ջ�Ƿ�Ϊ��
    public boolean isEmpty(){
        return list.isEmpty();
    }
	public static void main(String[] args) {
		MyStack s= new MyStack();
		s.push("1");
        s.push("2");
        s.push("3");
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.isEmpty());
	}
}

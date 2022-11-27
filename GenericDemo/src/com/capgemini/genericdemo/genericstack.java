package com.capgemini.genericdemo;

import java.util.*;


class genericstack1 <E>{

	Stack <E> stk = new Stack <E>();
	public void push (E obj) {
		
		
		stk.push(obj);
	//	System.out.println("hi"+obj);
	}
	public E pop() {
	//	System.out.println(obj);
		E obj = stk.pop();
		System.out.println(obj);
		return obj;
	}
	
}

public class genericstack{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		genericstack1 <String> gs = new genericstack1<String>();
		gs.push("kHello");
		System.out.println(gs.pop());
		//System.out.println(gs.pop());
		//System.out.println(gs.pop());
		
	}

}

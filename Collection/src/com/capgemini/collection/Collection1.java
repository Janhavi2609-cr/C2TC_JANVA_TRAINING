//program to demonstrate stack operation

package com.capgemini.collection;

import java.util.Stack;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> obj = new Stack<>();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		//obj.push(60);
		
		System.out.println(obj);
		
//		obj.pop();

		
		System.out.println(obj.peek());
		System.out.println(obj.search(200));
		//System.out.println(obj);

	}

}

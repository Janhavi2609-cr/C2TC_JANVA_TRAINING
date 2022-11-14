//program to demonstrate queue operation

package com.capgemini.collection;

//import java.util.Queue;
import java.util.PriorityQueue;
//import java.util.Stack;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stack<Integer> obj = new Stack<>();
		
		PriorityQueue<Integer> obj = new PriorityQueue<>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		//obj.add(70);
		
		System.out.println(obj);
		
		obj.remove();
		obj.remove();
		obj.remove();
		
		System.out.println(obj);
		
		//returns the head element of the list 
		System.out.println(obj.peek());
		
		//returns the number of element in the list
		System.out.println(obj.size());
		
		//retrives and remove the first element or return null if queue is empty
		System.out.println(obj.poll());
		
		System.out.println(obj.add(70));
		
	}

}

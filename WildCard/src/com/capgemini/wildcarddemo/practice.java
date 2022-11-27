package com.capgemini.wildcarddemo;

import java.util.Stack;

public class practice <E> {
	
	Stack <E> stk = new Stack <E>();
	public void push (E obj) {
		stk.push(obj);
	}
	public E pop() {
		E obj = stk.pop();
		return obj;
	}
}

class Output{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		practice <String> gs = new practice<String>();
		gs.push("Hello");
		System.out.println(gs.pop());
	}

}

//simple program to explain lambda function.

package com.capgemini.lambdaexpression;

interface Lambda{
	public void demo();
}

public class LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(() -> {
			System.out.println("This is my running thread.");}).start();
		}
}



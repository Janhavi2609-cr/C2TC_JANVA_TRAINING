//simple program to print a number using lambda expression

package com.capgemini.lambdaexpression;

interface Lambda1{
	abstract public void demo(int x);
}

public class LambdaExpression3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda1 obj = (int x) -> { System.out.println("Valule of x: "+x);
		}; 
		
		obj.demo(45);
	}

}


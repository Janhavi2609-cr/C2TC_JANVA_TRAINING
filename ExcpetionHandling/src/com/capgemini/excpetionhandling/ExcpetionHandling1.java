package com.capgemini.excpetionhandling;

public class ExcpetionHandling1 {

	void validate(int age) {
		try {
			if(age > 16) {
				System.out.println("Student is Eligible");
			}
			else {
				throw new ArithmeticException("Student not eligible");
				//System.out.println("Student not eligible");
			}
				
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcpetionHandling1 obj = new ExcpetionHandling1();
		obj.validate(10);
		System.out.println("Hello");
	}

}

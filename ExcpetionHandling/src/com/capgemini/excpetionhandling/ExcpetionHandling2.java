package com.capgemini.excpetionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class ExcpetionHandling2 {

	void m1() throws ArithmeticException{
		try {
			throw new ArithmeticException("Condition not satisfied");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		//System.out.println("Method 1 created");
	}
	
	void m2() throws IOException{
		try {
			System.out.println("method 2 created");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	void m3() throws SQLException{
		try {
			System.out.println("Method 3 created");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		ExcpetionHandling2 obj = new ExcpetionHandling2();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}

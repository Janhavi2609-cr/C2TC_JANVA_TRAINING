package com.capgemini.multithreading;

class Eclipse extends Thread{
	
	public void run(){ 	
		System.out.println("Eclipse Thread name is: "+ Thread.currentThread().getName()); 	
		}
}  

class calculator extends Thread {
	
	public void run(){ 	
	System.out.println("calculator Thread name is: "+ Thread.currentThread().getName()); 	}  
}  

class Chrome extends Thread{ 
	
	public void run(){ 		
		System.out.println("Chrome Thread name is: "+ Thread.currentThread().getName()); 	}
}
class OneNote extends Thread{ 
	
		public void run(){ 	
			System.out.println("OneNote Thread name is: "+ Thread.currentThread().getName()); 	
		}
}   


public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e=new Eclipse();	 	   
		e.start(); 	     	   
			
		calculator c=new calculator();	 	   
		c.start(); 	

		Chrome ch=new Chrome();	
		ch.start();
			
		OneNote on=new OneNote();	
		on.start();
	}

}

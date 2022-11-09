//to check the threads have priority or not


package com.capgemini.multithreading;

class Eclipse2 extends Thread{
	public void run() {
		System.out.println("Eclipse Thread name is: "+ Thread.currentThread().getName());
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class MultiThreading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse2 e = new Eclipse2();
		e.start();
		
		Eclipse2 e1 = new Eclipse2();
		e1.start();
		
		Eclipse2 e2 = new Eclipse2();
		e2.start();
	}

}

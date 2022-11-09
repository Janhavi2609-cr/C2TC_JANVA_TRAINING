package com.capgemini.multithreading;

class Eclipse4 extends Thread{
	public void run() {
		for(int i = 0; i<4; i++) {
			System.out.println("Eclipse Thread Name: " + Thread.currentThread().getName());
			System.out.println("Eclipse Thread Id: " + Thread.currentThread().getId());
			
		}
	}
}

public class MultiThreading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse4 e = new Eclipse4();
		e.start();
		
		for(int i = 0; i<4; i++) {
			System.out.println("Main thread name: "+Thread.currentThread().getName());
			System.out.println("Main Thread id: "+Thread.currentThread().getId());
		}
	}

}

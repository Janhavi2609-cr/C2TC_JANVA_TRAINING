package com.capgemini.multithreading;

class Eclipse3 extends Thread{
	public void run() {
		System.out.println("Eclipse thread name" +Thread.currentThread().getName());
		System.out.println("Eclipse Thread id: " + Thread.currentThread().getId());
		
	}
}

class calc extends Thread{
	public void run() {
		System.out.println("Calculator thread name: "+Thread.currentThread().getName());
		System.out.println("Calculator thread id: "+ Thread.currentThread().getId());
		
	}
}

class Chrome2 extends Thread{
	public void run() {
		System.out.println("Chrome Thread name" + Thread.currentThread().getName());
		System.out.println("Chrome Thread Id: " + Thread.currentThread().getId());
		
	}
}

class OneNote2 extends Thread{
	public void run() {
		System.out.println("Onenote thread name: " + Thread.currentThread().getName());
		System.out.println("Onenote thread id: " + Thread.currentThread().getId());
		
	}
}
public class MultiThreading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse3 e3 = new Eclipse3();
		e3.start();
		
		calc c = new calc();
		c.start();
		
		Chrome2 ch = new Chrome2();
		ch.start();
		
		OneNote2 on = new OneNote2();
		on.start();
		
		System.out.println("Main thread name: " + Thread.currentThread().getName());
		System.out.println("Main id: " + Thread.currentThread().getId());

	}

}

package com.jsp.MultiThreading;

public class ThreadDrive {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		
		Thread t=new Thread(myThread);
		t.start();
		
		
		MyThread2 myThread2=new MyThread2();
		myThread2.start();
	}

}

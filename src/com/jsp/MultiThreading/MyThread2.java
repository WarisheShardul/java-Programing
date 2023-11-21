package com.jsp.MultiThreading;

public class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=500;i++) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

package com.jsp.MultiThreading;

public class MyThread implements Runnable {
	@Override
	public void run() {
		for(int i=500;i>=1;i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

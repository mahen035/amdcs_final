package com.training.thread;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		int n = 8;
		for(int i=1;i<n;i++) {
			Thread t = new Thread(new MyThread(), "Thread "+i);// New
			
			t.start();  //Runnable
			Thread.sleep(1000); //Sleep
		}

	}

}

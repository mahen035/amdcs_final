package com.training.thread;

public class MyThread implements Runnable{
	
	@Override	
	public void run() {  //Running 
		System.out.println("Thread: "+Thread.currentThread().getName()+" is running");
	}
}

package com.my.practice.general;

public class MyThread extends Thread{//implements Runnable{

	/*@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}*/

	public static void main(String args[]) {
		MyThread t = new MyThread();
		t.start();
		t.start();
	}
	
	public void run() {
		System.out.println("hi there");
	}
}

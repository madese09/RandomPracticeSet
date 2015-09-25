package com.my.practice.sets;

public class RandomThreadSet implements Runnable{
    int x, y; 
	public void run(){
		for(int i=0;i<100;i++)
			synchronized (this) {
				x = 12;
				y = 12;
			}
		System.out.println(x +","+ y);
	}
	
	public static void main(String args[]){
		RandomThreadSet t = new RandomThreadSet();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}
}

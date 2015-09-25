package com.my.practice.sets;

import java.util.Scanner;

import javax.lang.model.type.NoType;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class RandomSetTwo{
	public static void main(String args[]){
		/*RandomSetTwo r = new RandomSetTwo();
		r.start();*/
		//System.out.println(4%2+","+3%2);
		DateTime d = DateTime.now();
		System.out.println(d);
		DateTimeFormatter df = DateTimeFormat.forPattern("dd-mm-yyyy");
		System.out.println(df.print(d));
	}
	
	void start(){
		int a = 1;
		int b = 2;
		System.out.println(""+3+4+"");
		System.out.println(a+b);
		System.out.println(f()+a+b);
	}
	
	String f(){
		return "hi";
	}
	
	public static Object testObjectGarbageCollection(){
		Object o = new Object();
		Object[] oArr = new Object[1];
		oArr[0] = o;
		o= null;
		return oArr[0];
	}
	
	public void testBoolean(){
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 =true;
		System.out.println(b1&b2|b2&b3|b2);
		System.out.println(b1&b2|b2&b3|b2|b1);
		
	}
	
	
}

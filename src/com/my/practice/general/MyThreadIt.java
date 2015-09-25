package com.my.practice.general;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadIt {
   private static final AtomicInteger nextId = new AtomicInteger();
   
   static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
	   protected Integer initialValue(){
		   return nextId.getAndIncrement();
	   }
   };
   
   public static int getCurrentThreadUniqueId(){
	   return threadLocal.get();
   }
	
}

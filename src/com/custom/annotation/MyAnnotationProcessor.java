package com.custom.annotation;

import java.lang.reflect.Method;

public class MyAnnotationProcessor {
	
	public static void main(String args[]) {
		Method[] ms = TestMyAnnotationUsage.class.getMethods();
		for(Method m :ms){
			if(m.isAnnotationPresent(Secured.class)) {
				System.out.println("is secured ===="+m.getName());
			}
		}
	}

}

package com.custom.annotation;

public class TestMyAnnotationUsage {
	
	@Secured(isSecured=true)
	public void testMyMethod(){
		System.out.println("Hi am just checking if my method is secured");
	}

}

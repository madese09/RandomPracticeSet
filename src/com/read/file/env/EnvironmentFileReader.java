package com.read.file.env;

import java.util.Calendar;
import java.util.Date;

public class EnvironmentFileReader {
	private static final String DEFAULT_PATH = "testData/";
	private static final String PATH_FROM_ENV = "TEST_DATA_PATH";
	
	public String getFilePath() {
		Calendar c = Calendar.getInstance();
		c.set(2013, 5, 9);
		System.out.println(c.toString());
		return DEFAULT_PATH;
	}
	
	

}

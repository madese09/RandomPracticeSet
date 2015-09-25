package com.my.practice.sets;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RandomStringSet {
	public static void main(String args[]){
		
		
		//int i = switchCase(4);
		/*String s = "expedia.app.android.tablet";
		String st = substringAfter(s,".");
		System.out.println(st);*/
		//testingBasic();
	}
	
	public boolean contains(String str , String search){
		if(str == null && search == null){
			return false;
		}
		
		return str.indexOf(search) >= 0;
	}
	
	public static String substringAfter(String str, String separator){
		int i = str.indexOf(separator);
		System.out.println(separator.length());
		if(i == -1) {return "";}
		
		return str.substring(i+separator.length());
		
	}
	
	public static String testingBasic(){
		/*String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		s2 = "fff";
		System.out.println(s1+s2+s3);*/
		
		String x = "abc";
		x.toUpperCase();
		String replacedStr = x.replace("Y", "y");
		System.out.println(replacedStr);
		replacedStr = replacedStr+"xyz";
		System.out.println(replacedStr);
		return "";
	}
	/*public static int switchCase(int x){
		int i = 1;
		switch(x){
		case 1 : i++;
		case 2 : i++;
		case 3 : i++;
		case 4 : i++;
		case 5 : i++;
		default : i++;
		}
		return i+x;		
	}
*/
}

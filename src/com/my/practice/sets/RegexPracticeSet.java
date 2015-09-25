package com.my.practice.sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeSet {
  public static void main(String args[]){
	  checkHackerrank("test is an awesome place for programmers");
	  //System.out.println(check("I love #hackerrank"));
	  /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  try{
		 int numOfSteps = Integer.parseInt(br.readLine());
		 List<String> l = new ArrayList<String>();
		 for(int i=0;i<=numOfSteps;i++){
			 String input = br.readLine();
			 l.add(check(input)?"true":"false");
			 System.out.println(Collections.frequency(l, "true"));
		 }
		 
		  
	  }catch(IOException ioe){
		  System.out.println("throws io exception"+ioe);
	  }*/
	/* Scanner scan = new Scanner(System.in);
	 while(scan.hasNext()){
		 String s = printValidLine(scan.nextLine());
		 if(s != null){
		 System.out.println(s);
		 }
	 }*/
	  //checkDate();
	  //checkValidPhoneNumber("91 011 2341362");
	
  }
  
  private static boolean check(String input){
	 Pattern p = Pattern.compile("[hH]acker[rR]ank", Pattern.CASE_INSENSITIVE| Pattern.UNICODE_CASE);//("[hH]acker[rR]ank");
	 Matcher m = p.matcher(input);
	 return m.find();
  }
  
  private static boolean checkIP(){
	  String pattern = "^(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)."+
			           "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)."+ 
			           "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)."+
			           "(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)$";
	 //Pattern p =  Pattern.compile("\(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\b");
	return false;		  
			  //"\'(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\')\.\'(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\')\.\'(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\')\.\'(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\')");
  }
  private static String printValidLine(String input){
      Pattern p = Pattern.compile("^Hi\\s(?!d|D).*",Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(input);
      if(m.matches()){
          return input;
      }
      return null;
  }
  
  private static void checkValidPhoneNumber(String input){
	  Pattern p = Pattern.compile("(\\d{1,3})([- ])(\\d{3})([- ])(\\d{4,9})");
	  Matcher m = p.matcher(input);
	  //System.out.println(m.group());
	  if(m.find()){
		  System.out.println(m.group(1)+","+m.group(2)+","+m.group(3)+","+m.group(5));
		  
	  }
	 // System.out.println(m.group(0)+","+m.group(1)+","+m.group(2));
  }
  
  private static void checkDate(){
	  Pattern p = Pattern.compile("^(0?[1-9]|[12][1-9]|3[01])[/](0?[1-9]|1?[12]|[A-Z][a-z]{2})[/](\\d{4})$");
	  Matcher m = p.matcher("09/May/2015");
	  System.out.println(m.matches());
  }
  
  private static void checkHackerrank(String input){
	  System.out.println(input);
	  Pattern p = Pattern.compile("\\bhackerrank\\b");
	  Matcher m = p.matcher(input);
	  while(m.find()){
		  System.out.println(m.start()+","+m.end());
	  }
  }
 
}

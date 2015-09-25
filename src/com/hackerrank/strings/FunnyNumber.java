package com.hackerrank.strings;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 2
   acxz
   bcxz
 */
public class FunnyNumber {
	public static void main(String args[]) {
		findAndReplace("dd-mm-yyyy","09/05/2015");
		/*Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for(int i =0;i<testCases;i++){
		System.out.println(s.next());
		}*/
		
	}
	
	private static String findAndReplace(String expected, String actual){
		System.out.println("Actual date from Model "+ actual);
		/*expected = "dd-mm-yyyy";
		actual = "09/05/2015";*/
		char[] actualC = actual.toCharArray();
		char[] expectedC = expected.toCharArray();
		char asciiValueExpected = getAsciiExpected(expectedC);
		for(int i = 0; i<actualC.length;i++) {//char c : a) {
			char asciiV = actualC[i]; 
			if(asciiV == 45 || asciiV == 46 || asciiV == 47){
				actualC[i]= asciiValueExpected;
				//a[i]
			}
			System.out.println(actualC[i]);
		}
		String s = String.copyValueOf(actualC);
		System.out.println("Final op = "+s);
		return expected;
	}
	/*
	 * 
- 45
. 46
/ 47
	 */
	private static char getAsciiExpected(char[] expectedC) {
		for(int i = 0; i<expectedC.length;i++) {//char c : a) {
			char asciiV = expectedC[i]; 
			if(asciiV == '-' || asciiV == '.' || asciiV == '/'){
				return asciiV;
			}
		}
		return '\0';
	}
	private static String funnyNumbers(String input) {
		return "Not Funny";
	}

}

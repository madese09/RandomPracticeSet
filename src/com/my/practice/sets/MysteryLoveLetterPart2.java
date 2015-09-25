package com.my.practice.sets;

import java.util.Scanner;

public class MysteryLoveLetterPart2 {
 public static void main(String args[]) {
	 Scanner scan = new Scanner(System.in);
	 int c=scan.nextInt();
	 while(c>=0){
		 System.out.println(checkPalindrome(scan.next()));
		 --c;
	 }
	 scan.close();
 }
 
 private static int checkPalindrome(String word){
	 int count =0;
	 char[] chArr = word.toCharArray();
	 int chArrLength = chArr.length - 1; 
	 //check both ways element[0]-element[length-1]...
	 if(chArrLength != -1){
		 for(int i=0;i<chArr.length/2;i++,chArrLength--) {
			 int checkEqual = chArr[i] - chArr[chArrLength];
			 count = count + (checkEqual<0?-checkEqual:checkEqual);
		 }
	 }
	 return count;
 }

}

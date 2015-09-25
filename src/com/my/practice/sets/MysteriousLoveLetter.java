package com.my.practice.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * each string to changed to palindrome
 * rules :
 * 1. reduce the value of the letter from extreme right
 * 2. he has to repeatedly reduce the number ,inorder to acheive palindrome,
 * 
 * @author madhumitab
 *
 */
public class MysteriousLoveLetter {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		while(c>=0){
			
			//List count = getMePalindrome(scan.nextLine());
            /*if(count!=null && count.size()>0){
                System.out.println(count.get(0));
            }*/
			c--;
		}
    }
	
	
   /*public static List<Integer> getMePalindrome(String input){
		List<Integer> howManyTimesWordGotChanged = null;
		if(input.length() != 0){
			char[] ch = input.toCharArray();
			int holder = ch.length-1;
			int counter = 0;
			boolean flag = false;
	       // check from the extreme right after each decrement check the string is palindrome
			while(flag==false  && input.length() != 0){
				howManyTimesWordGotChanged = new ArrayList<>();
                //Check the input first 
				if(checkPalindrome(input) && input != ""){
					howManyTimesWordGotChanged.add(counter);
					flag=true;
					return howManyTimesWordGotChanged;
				}
				char val = ch[holder];
                if(ch[0]>val){
                    System.out.println("first element is bigger than the last element");
                    char holdTheFirstEle = ch[0];
                    while(ch[0]>'a'){
                    	holdTheFirstEle--;                    
                        counter++;
                        if( checkPalindrome(String.valueOf(ch))){
                            howManyTimesWordGotChanged.add(counter);
                            flag = true;
                            return howManyTimesWordGotChanged;
                        }
                    }
                }else{    
                    while(val>'a'){
                        val--;
                        counter++;
                        ch[holder] = val;//form the str and check
                        if( checkPalindrome(String.valueOf(ch))){
                            howManyTimesWordGotChanged.add(counter);
                            flag = true;
                            return howManyTimesWordGotChanged;
                        }
                    }
                }
				holder--;
			}
		}
		return howManyTimesWordGotChanged;
	}*/
	

	
	public static boolean checkPalindrome(String input){
		char[] ch = input.toCharArray();
		char[] holder = new char[ch.length];
		int counter = ch.length;
		for(int i=0;i<=holder.length && counter>0;i++,counter--){
		   holder[i] = ch[counter-1];
		}
		return String.valueOf(holder).equals(input);
	}
}

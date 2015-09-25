package com.my.practice.all.about.integers;

public class SetOne {
	public static void main(String args[]){
		//System.out.println(fact(5));
		//System.out.println("with recursion "+factRec(6));
		System.out.println("the missing number from the AP"+findTheMissingNumberFromAP(new int[]{51, 11, 31, 41, 51}));
	}
	
	/**
	 * n(n-1)(n-2)..... 
	 */
	static int fact(int num){
		int  res=1;
		do{
			System.out.println("hello"+num);
			res = res*num;
			num--;
		}while(num>0);
		return res;
	}
	
	static int factRec(int num){
		int result = 1;
		if(num == 0 || num == 1)
			return 1;
		result = num * factRec(num-1);
		return result;
	}
	
	/**
	 * Arithmetic progression 
	 */
	static int findTheMissingNumberFromAP(int[] arr){
		for(int i=0;i<arr.length;i++){
			int constant = findConstant(arr, i);
		//check if the difference between consecutive number is > constant diff
			if((arr[i+1] -arr[i]) > constant){
				System.out.println(arr[i]+constant);
				return arr[i]+constant;
			}
		}
		return 0;
	}
	
	/*use binary sort TODO*/
	static int findConstant(int arr[], int i){
		//find the constant 
		System.out.println(arr.length);
		int diffStart = arr[1]-arr[0];
		int diffRandomNumber = arr[i+1] -arr[i];
		

		return 0;
	}
	
}

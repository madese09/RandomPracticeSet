package com.hackerrank.practiceset;

import java.util.Scanner;

public class SherlockAndArray_Search {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfTestCase = scan.nextInt();
		for(int i = 0 ;i<numOfTestCase;i++){
			int arrSize = scan.nextInt();
			int[] a = new int[arrSize];
			//adding elements 
			for(int j=0;j<arrSize;j++){
				a[j] = scan.nextInt();
			}
			System.out.println(getMeWatsonNumber(a));
		}
	}
	public static int getLeftSummation(int pivotPosition,int iArr[]){
		int sum=0, holder=pivotPosition-1;
		while(holder>=0){
			sum= sum+iArr[holder];
			holder--;
		}
		return sum;
	}
	public static String getMeWatsonNumber(int iArr[]){
		int leftSum =0, rightSum =0;
		int pivotPosition = 0;
		int i =0;
		while(i<iArr.length){
			leftSum = getLeftSummation(pivotPosition, iArr);
			rightSum = getMeRightSummation(pivotPosition, iArr);
			if(leftSum == rightSum){
				return "YES";//+ leftSum +","+rightSum;
			}
			++pivotPosition;
			i++;
		}
		return "NO";
	}
	public static int getMeRightSummation(int pivotPosition, int[] iArr){
		int sum =0, holder=pivotPosition+1;
		while(holder<iArr.length){
			sum = sum+iArr[holder];
			holder++;
		}
		return sum;
		
	}

}

package com.my.practice.sets;

import java.util.Arrays;
import java.util.Scanner;

public class CodelityTest1 {

	 public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
	        int numOfEle = s.nextInt();
	        int[] iArr =  new int[numOfEle]; 
	        for(int i =0 ; i<numOfEle ;i++) {
	        	int elements = s.nextInt();
	        	iArr[i] = elements;
	        }
	        //int[] iArr = new int[]{10, 2, 44, 15, 39, 20};
	       // System.out.println(Arrays.toString(iArr));
	        System.out.println(solution(iArr));
	    }    
	    public static int solution(int[] A) {
	       Arrays.sort(A);
	       int amplitude = 0, arrLength = A.length ;
	       int min = A[0] 	, max = A[arrLength - 1];
	       amplitude = max - min ;
	       return amplitude;
	    }

}

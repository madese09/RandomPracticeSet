package com.hackerrank.practiceset;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WarmUpSets {
	
    public static void main(String[] args) {
      /* Scanner s = new Scanner(System.in);
       int size = s.nextInt();
        int[][] i2D = new int[size][size];
       for(int col=0;col<size;){
           for(int row=0;row<size;row++){
               i2D[col][row] = s.nextInt();
           } col++;
       } 
       System.out.println(diagonalDiff(i2D)); 
       s.close(); */
    	//System.out.println(precision());
    	
    	/*Scanner scan = new Scanner(System.in);
    	int size = scan.nextInt();
    	int positive=0,negative=0,zero=0;
    	for(int i=0;i<size;i++){
    		int elements = scan.nextInt();
    		if(elements >0){
    			++positive;
    		}
    		if(elements<0){
    			++negative;
    		}
    		if(elements==0){
    			zero++;
    		}
    	}
    	
    	System.out.println(precision(positive,size));
    	System.out.println(precision(negative,size));
    	System.out.println(sprecision(zero,size));*/
    	
    	/*For utopian :Scanner scanTestCase = new Scanner(System.in);
		int[] numberOfCycles = new int[scanTestCase.nextInt()]; 
		for(int i : numberOfCycles) {
			int utopianHeight = getMeHeight(scanTestCase.nextInt());
			System.out.println(utopianHeight);
		}*/
    	
    	//Scanner s = new Scanner(System.in);
    	//String s = "stair";
    	//System.out.println(countOfPrimeNumber(s.nextInt()));
    	staircase();
    }
    
    /**
     * 3(row and col size of 2d array)
     * 11 2 3
     * 2 4 5
     * 5 6 -1
     * @param iArr
     * @return
     */
	public static int diagonalDiff(int[][] iArr) {
       int leftDiagonalSummation = 0;
	    	 int rightDiagonalSummation =0;
	    	 for(int i=0;i<iArr.length;i++){
	    		 leftDiagonalSummation+=iArr[i][i];
	    	 }
	    	 for(int j=iArr.length-1,k=0;j>=0 && k<=iArr.length-1;j--,k++) {
	    		 rightDiagonalSummation +=iArr[j][k];
	    	 }
	    	 
	   return Math.abs(leftDiagonalSummation - rightDiagonalSummation);
    }

	/**
	 * 6
     * -4 3 -9 0 4 1 
     * give me fraction value of postive nummber   
	 */
	public static String precision(int elementC, int size) {
		DecimalFormat myFormatter = new DecimalFormat("0.000000");
		//float f = 1/6;
		return myFormatter.format(((double)elementC/(double)size));
	}
	
	public static int countOfPrimeNumber(int input) {
		int count =0, j=2;
		boolean isP=false;
		while(j<=input){
			for(int n=2;n<=input;){ //pay extra attention here better to use Math.sqrt(input) but issue with smaller values like 5
				if(j%n==0){
					isP = j==n; //one more major change to be considered
					break;			
				}
				n++;
			}
			if(isP==true){
				++count;
				//System.out.println(j);
			}
			j++;
		}
		return count;
	}
	
	/**
	 * Utopian tree input 
	 * 2
	 * 3
	 * 4
	 * output :
	 *   
	 * @param noOfCycles
	 * @return
	 */
    private static int getMeHeight(int noOfCycles){
        int height = 1, counter = noOfCycles;
        boolean flagAlternate = false;
        do{
          if(counter==0){
        	  return height ;
          }
          //for first always double and alternate 
          if(counter == noOfCycles || flagAlternate == true){
        	  height = height +height;
        	  flagAlternate= false;
          }else {
        	  height +=1;
        	  flagAlternate = true;
          }
          //check the number of no of cycles even or odd
          counter--;  
        }while(counter>0);
        
        return height;
    }
    
    private int findMeXor(int x, int y){
    	return x^y;
    }
    
    private static void staircase(){
    	int i=0;String s="";
    	for(;i<=6;i++){
    		s=s+"#";
    		System.out.println(s);
    	}
    }
     
}

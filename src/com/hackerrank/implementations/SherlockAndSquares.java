package com.hackerrank.implementations;

import java.util.Scanner;

/**
 * 2
3 9
17 24
2
0
 * @author madhumitab
 *
 */
public class SherlockAndSquares {
	public static void main(String[] args) {
		String s = "DMK1";
		String[] sArr =s.split("-"); 
		for(String s1 : sArr){
			System.out.println(s1);
		}
        /*Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        for(int i=0;i<testCases;i++){
            String to = s.next();
            String from = s.next();
            System.out.println(getCountOfSquareNumbers(Double.valueOf(to), Double.valueOf(from)));
        }*/
	}
	
	private static int getCountOfSquareNumbers(Double to, Double from) {
		int count = 0;
		for(Double i = to; i<=from ;i++) {
			if(checkIsPerfectSqrt(i)) {
				count = count+1;
			}
		}
		return count;
	}

	private static boolean checkIsPerfectSqrt(Double input) {
		boolean isPerfectSquare = true;
        double residue = Math.sqrt(input) - Math.round(Math.sqrt(input));
        if(Math.abs(residue) > 0.0){
        	isPerfectSquare = false;
        }
		return isPerfectSquare;
	}
}

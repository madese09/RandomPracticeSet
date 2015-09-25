package com.my.practice.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaximumXOR {
	public static void main(String args[]){
		/*Scanner scan = new Scanner(System.in);
		int _l ;
		_l = Integer.parseInt(scan.nextLine());
		int _r;
		_r = Integer.parseInt(scan.nextLine());*/
		int result = findMyXor(10, 15);
	}
	
	private static int findMyXor(int _l, int _r){
		Set<Integer> holdXorValues = new HashSet<Integer>();
		for(int i = _l;i<=_r;i++){
			for(int j = _r;j>=_l;j--){
				int xorVal = i^j;
				holdXorValues.add(xorVal);
			}
		}
		return Collections.max(holdXorValues);
	}

	private static int findMax(){
		return 0;
	}
}

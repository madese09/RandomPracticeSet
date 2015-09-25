package com.hackerrank.practiceset;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 10
203 204 205 206 207 208 203 204 205 206
13
203 204 204 205 206 207 205 208 203 206 205 206 204
 * @author madhumitab
 *
 */
public class MyNumberGoneMissing {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int listSize = s.nextInt();
		Map<Integer, Integer> m = new TreeMap<>();
		for(int i=0;i<listSize;i++){
			int key = s.nextInt();
			m.put(key, m.containsKey(key)?m.get(key)+1:1);
		}
		System.out.println(m+", size"+m.size());
		int listTwoSize = s.nextInt();
		for(int j=0;j<listTwoSize;j++){
			int _key1 = s.nextInt();
			m.put(_key1,m.containsKey(_key1)?m.get(_key1)-1:-1);
		}
		System.out.println(m);
	    for(Entry<Integer, Integer> e : m.entrySet()){
	    	if(e.getValue() != 0){
	    	System.out.println(e.getKey());
	    	}
	    	
	    }
		
	}

}

package com.hackerrank.practiceset;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * If the book is returned on or before the expected return date, no fine will be charged, in other words fine is 0.
   If the book is returned in the same month as the expected return date, Fine = 15 Hackos × Number of late days
   If the book is not returned in the same month but in the same year as the expected return date, Fine = 500 Hackos × Number of late months
   If the book is not returned in the same year, the fine is fixed at 10000 Hackos.
 * @author madhumitab
 *
 */
/*
 * i\p:
 * 9 6 2015
   6 6 2015
   
   6 6 2015
   9 6 2016
   o\p:15*3 = 45
 */
public class LibraryFine {
	public static void main(String[] args) {
	      Scanner s = new Scanner(System.in);
	      int dayA = s.nextInt(), monthA =s.nextInt(), yearA = s.nextInt();  
	      int dayE = s.nextInt(), monthE = s.nextInt(), yearE = s.nextInt();
	      Calendar actual = Calendar.getInstance();
	      actual.set(yearA, monthA-1, dayA);  
	      Calendar expected = Calendar.getInstance();
	      expected.set(yearE, monthE-1, dayE);
	      System.out.println(getLibraryFine(expected,actual));
	    }
	    
	    private static int getLibraryFine(Calendar expected, Calendar actual) {
	        int yearE = expected.get(Calendar.YEAR);
			int monthE = expected.get(Calendar.MONTH);
			int dayE = expected.get(Calendar.DAY_OF_MONTH);
			int yearA = actual.get(Calendar.YEAR);
			int monthA = actual.get(Calendar.MONTH);
			int dayA = actual.get(Calendar.DAY_OF_MONTH);
			/*if(expected.before(actual)){
				return 0l;
			}else */if(yearE== yearA && monthE== monthA) {
				if(dayE>=dayA){
					return 0;
				}else{
					return 15*(dayA-dayE) ;
				}
			}else if(yearE ==yearA) {
				if(monthE<=monthA){
					return 500 *(monthA-monthE);
				}
			}else if(yearE!=yearA && yearA >yearE){
				return 10000;
			}
			return 0;
	    }
	
}

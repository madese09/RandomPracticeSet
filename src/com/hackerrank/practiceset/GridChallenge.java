package com.hackerrank.practiceset;

import java.util.Arrays;

/**
 * 1
5
ebacd
fghij
olmkn
trpqs
xywuv

check all lexicographically sorted
 * @author madhumitab
 *
 */
public class GridChallenge {
	private final static int INSERTION_THRESHOLD = 7; 
   public static void main(String args[]) {
	   iSort(new char[]{'e','b','a','c','d'});
	   
	   //mergeSortAndSwap(new char[]{'e','b','a','c','d'});
	   /*String sayYes = (checkIsSortedLexi()==true)?"YES":"NO";
	   System.out.println(sayYes);*/
   }
   
   private static void mergeSortAndSwap(char[] cArr, int fromIndex, int toIndex) {
	   /*int length = toIndex - fromIndex;
	   //use inssertion sort for the smaller array;
	   if(length <= INSERTION_THRESHOLD) {
		   //use insertion sort
		   
	   }*/
	   
   }
   
   private static boolean checkIsSortedLexi() {
	   return false;
   }
   
   private static void iSort(char[] oArr) {
	   int i ;
	   int valueHolder;
	   int j;
	   for(i=1;i<oArr.length;i++){
		   valueHolder=oArr[i];
		   for(j=i-1;j>0 && oArr[j]<valueHolder;j--){
			  oArr[j+1]=oArr[j]; 
		   }
		   oArr[j+1]= (char)valueHolder;
	   }
   }
   
   static char[] toChars(int codePoint){
	   char[] result = new char[2];
	   int offset = codePoint - 0x010000;
	   result[1] = (char)((offset&0x3ff) + '\uDC00');
	   result[0] = (char)((offset>>>10)+'\uDBFF');
	   return result;
   }
   
   
}

package com.my.practice.sets;

import java.util.Arrays;

public class RandomPracticeSetOne {

	public static void main(String[] args) {
		
		
		//int iArr[] = {2,25,6,20,0,9};
		//mergeSort(iArr);
		//quickSort(iArr, 0, (iArr.length -1));
		//System.out.println("After sorting"+Arrays.toString(iArr));
		
	}
	
	public static void quickSort(int[] iArr, int startIndex, int endIndex){
		int index = divide(iArr, startIndex, endIndex);
		System.out.println("index = "+index);
		if(startIndex < (index-1)){
			
			quickSort(iArr, startIndex, (index-1));
			//System.out.println("start < index"+Arrays.toString(iArr));
		}
		if(endIndex > index){
			
			quickSort(iArr, index, endIndex);
			System.out.println("end > index"+Arrays.toString(iArr));
		}
	}
	
	public static int divide(int[] iArr, int startIndex, int endIndex){
		int pivot = iArr[startIndex];
		System.out.println("pivot = "+pivot);
		while(startIndex<=endIndex){
			
		  //compare the value of pivot and the startIndex
			if(iArr[startIndex]<pivot){
				startIndex++;
			}
			if(iArr[endIndex]>pivot){
				endIndex--;
			}
			//swap numbers
			if(startIndex<=endIndex){
				int temp = iArr[startIndex];
				iArr[startIndex] = iArr[endIndex];
				iArr[endIndex] = temp;
				startIndex++;
				endIndex--;
			}
			
		}	
		return startIndex;
		
	}
	
	
	public static void mergeSort(int iArr[]){
		/*split the list into 2 and compare the first tow elements 
		and push the lowest to another list*/
		int iAFirst[] = new int[iArr.length/2];
		int iASec[] = new int[iArr.length - iAFirst.length];
		System.arraycopy(iArr, 0, iAFirst, 0, iAFirst.length);
		System.arraycopy(iArr, iAFirst.length, iASec, 0, iASec.length);
		System.out.println("iArr = "+Arrays.toString(iArr)+", iAfirst= "+Arrays.toString(iAFirst)+", iASec= "+Arrays.toString(iASec));
		mergeSortOverLoaded(iAFirst, iASec, iArr);
		System.out.println("After sorting iArr = "+Arrays.toString(iArr));
		
	}
	
	public static void mergeSortOverLoaded(int iAFir[], int iASec[], int iArr[]){
		int i = 0, j = 0 , k = 0;
		
		//loop thru both the arrays
		while(i < iAFir.length && j < iASec.length){
			//compare the two and keep on incrementing 
			//each pointer unique
			if(iAFir[i]<iASec[j]){
				iArr[k] = iAFir[i];
				i++;
			}else{
				iArr[k] = iASec[j];
				j++;
			}
			k++;
		}
		
		//System.out.println("results "+Arrays.toString(iArr));
		//copy 
		//System.arraycopy(iAFir, srcPos, iArr, destPos, length);
		System.arraycopy(iAFir, i, iArr, k, iAFir.length - i);
		System.arraycopy(iASec, j, iArr, k, iASec.length - j);
		
	}
	
	
	

}

package com.my.practice.sets;

public class CodlityTest2 {

	public static void main(String args[]) {
        int[] iArr = new int[]{0,3,3, 7,5 , 3,11,1};
        System.out.println(solution(iArr));
    }    
    public static int solution(int[] A) {
    	int distance = 0;
    	for (int to =0; to <A.length;to++){
    		for(int from=to;from<A.length;from++){
    			distance = A[from] - A[to];
    			if(distance>0 &&  !checkIfNumberLiesBetweenTheIndices(to, from, distance, A)){
    				System.out.println(A[to] + "," + A[from] +"adjacent");
    				return distance;
                 }
             }
             
    		//to++;
    	}
    	return distance;
    }
    public static boolean checkIfNumberLiesBetweenTheIndices(int to , int from,int distance, int[] A) {
    	for(int i = to;i<=from;){
    		if(A[i]==distance){
    			return true;
    		}
    		i++;
    	}
    	return false;
    }
    
}

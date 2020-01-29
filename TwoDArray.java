package com.ss.homework.addition;

public class TwoDArray {
	
	 public static int getMax(int[][] nums) {
	    int max = nums[0][0];
	    for (int i = 0; i < nums.length; i++) {
	    	for (int j = 0; j < nums[i].length; j++) {
	    		if (nums[i][j] > max) {
	    			max= nums[i][j];
	    		}
	    	}
	    }
	    	return max;
	 }
	
	public static void main(String[] args) {
		
		int[][] twoDArr = {
                {6, 0, 5, 12, 16},
                {1, 4, 18, 8, 13},
                {9, 11, 0, 2, 26},
                {0, 2, 6, 3, 28}
        };
        System.out.println(getMax(twoDArr));
		
	}

}


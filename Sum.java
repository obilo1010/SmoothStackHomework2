package com.ss.homework.addition;

public class Sum {
	
	public static int add(int[] a) {
		
		int sum = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			sum += a[i];
		}
		return sum;
	}
	
	
	public static int checkArgs(String arg) {
		
		try {
			return Integer.parseInt(arg);
		} 
		catch (NumberFormatException e) {
			
			return 0;
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[args.length];
		int count = 0;
		
		for (String arg : args) {
			
			if (Sum.checkArgs(arg) == 0) {
			
			arr[count] = 0;
			
			count++;
			
			} else {
				
				int num = Integer.parseInt(arg);
				
				arr[count] = num;
				
				count++;	
			}	
		}
		
		int finalSum = add(arr);
		
		System.out.println(finalSum);

	}

}

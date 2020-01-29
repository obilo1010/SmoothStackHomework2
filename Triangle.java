package com.ss.homework.addition;

public class Triangle implements Shape {

	@Override
	public void calculateArea(int a, int b) {
		
		double area = ((a * b)/2);
		int solution = (int) area;
		display(solution);
	}

	@Override
	public void display(int a) {
		System.out.println(a);
		
	}
	

	

}

package com.ss.homework.addition;

public class Rectangle implements Shape {

	@Override
	public void calculateArea(int a, int b) {
		int area = a * b;
		display(area);
	}

	@Override
	public void display(int a) {
		
		System.out.println(a);
		// TODO Auto-generated method stub
		
	}

}

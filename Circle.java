package com.ss.homework.addition;

public class Circle implements Shape {

	@Override
	public void calculateArea(int r, int i) {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		
		double area = pi*(r*r);
		int solution = (int) area;
		display(solution);
	}

	@Override
	public void display(int a) {
		
		System.out.println(a);
		// TODO Auto-generated method stub
		
	}

}

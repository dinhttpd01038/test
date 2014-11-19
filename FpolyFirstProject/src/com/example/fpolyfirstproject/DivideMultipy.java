package com.example.fpolyfirstproject;

public class DivideMultipy {
	private double currentVal;
	public DivideMultipy(double a){
		currentVal = a;
	}
	
	public void multiply(double a){
		currentVal *= a;
	}
	
	public void divide(double a){
		if (a == 0.0){
			throw new java.lang.ArithmeticException("Can't divide by zero!");
		}
		currentVal /= a;
	}

	public double getCurrentVal(){
		return currentVal;
	}
}

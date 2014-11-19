package com.example.fpolyfirstproject;

public class AddSubtract {
	private int currentVal;
	public AddSubtract (int a){
		currentVal = a;
	}
	
	public void add(int a){
		currentVal += a;
	}
	
	public void subtract(int a){
		currentVal -= a;
	}
	
	public int getCurrentVal(){
		return currentVal;
	}

}

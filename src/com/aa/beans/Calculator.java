package com.aa.beans;

public class Calculator {
	public int add(int a, int b) {
		System.out.println("In add() method");
		return a + b;
	}

	public int substract(int a, int b) {
		System.out.println("In substract() method");
		return a - b;
	}

	public int multiply(int a, int b) {
		System.out.println("In multiply() method");
		return a * b;
	}
}

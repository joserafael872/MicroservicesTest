package com.example.demo;

public class Fibonacci {

	static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8; 
		if(n<=0) {
			System.out.println("the number should be major to zero");
		}	
		else {
			System.out.println("the "+n+ "th fibonacci numer is " +fib(n));
		}
		
	}

}

package com.epam.FirstAssignment;

class SimpleCalculator {
	void addition(int a,int b) {
		System.out.println("Addition of Given Two Values : " + (a + b));
	}
	void subtraction(int a,int b) {
		System.out.println("Subtraction of Given Two Values : " + (a - b));
	}
	void multiplication(int a,int b) {
		System.out.println("Multiplication of Given Two Values : " + (a * b));
	}
	void division(int a,int b) {
		try {
			System.out.println("Division of Given Two Values : " + a + b);
		}
		catch(ArithmeticException e) {
			System.out.println("Divided By Zero Exception is encounted.Please Give Valid Values!!!");
		}
	}
}
public class App 
{
    public static void main( String[] args )
    {
    	int a = 5;
    	int b = 5;
        SimpleCalculator obj = new SimpleCalculator();
        obj.addition(a, b);
        obj.subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
    }
}

package Exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;


class Demo1 {
	
	public static void main(String args[])
	{
		m1();
	}
	static void m1()
	{
		m2();
		System.out.println("Hii M1 method");
		
	}
	static void m2()
	{
		m3();
		System.out.println("Hii M2 method");
		
	}
	static void m3()
	{
		try {
		System.out.println("Hii M3 method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("Result is "+c);
		
		
		}
		
		catch(InputMismatchException ime)
		{
			System.out.println("Boss please enter number only");
				
		}
		
		catch(ArithmeticException ae)
		{
			System.out.println("Boss please dont2 divide by zero");
			
		}
		catch(Exception e)
		{
			System.out.println("e");
			
		}
		finally
		{
			System.out.println("Thank you");
			
		}
	}
}

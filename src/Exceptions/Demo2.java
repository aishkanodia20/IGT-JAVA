package Exceptions;

import java.io.*;

public class Demo2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

				m1();
			}
			static void m1() throws FileNotFoundException
			{
				m2();
				System.out.println("Hii M1 method");
				
			}
			static void m2() throws FileNotFoundException
			{
				m3();
				System.out.println("Hii M2 method");
				
			}
			static void m3() throws FileNotFoundException
			{
				File f = new File("Aish.txt");
				FileReader fr = new FileReader(f);
			}
	}



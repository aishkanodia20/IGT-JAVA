package P2;

import P1.A;

public class D extends A {
	
	void display()
	{
		
		System.out.println(b);
		System.out.println(c);
	}

}
class E extends D
{
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class F
{
	void display()
	{
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
}
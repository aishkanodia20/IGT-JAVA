package P1;

public class A {

	private int a = 100;
	public int b = 200;
	protected int c = 300;
	
	int d = 400;
	
	void display()
	{
		System.out.println("Private a: "+a);
		System.out.println("Public b: "+b);
		System.out.println("Protected c: "+c);
		System.out.println("Default d: "+d);
	}
	
}

class B extends A
{
	void display()
	{
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class C
{
	void display()
	{
		
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println(a1.d);
	}
	
}


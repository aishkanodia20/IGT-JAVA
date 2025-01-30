package ABSint;

class A
{
	int a =0;

	A()
	{
		
	}
	void abc()
	{
		
	}
	abstract void xyz();
}
class A1{}
class A2 extends A1,A
{
	
}
abstract class B
{
	int b;
	B()
	{
		
	}
	void aaa();
	public abstract void xyz();
}

interface J{
	
}
interface extends I,J{}
public class Demo1{
	public static void main(String args[])

	
{
		A a = new A();
		System.out.println(a.a);
		B b = new B();
		I i = new I();
		}
}


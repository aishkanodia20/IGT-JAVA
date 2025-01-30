package P1;

abstract class A1
{
	abstract void abc();
	abstract void xyz();
	abstract void OT();
}

abstract class B1 extends A1
{
	void abc()
	{
		
	}
	
	void xyz()
	{
		
	}
	
	abstract void atoz();
}

class C extends B1
{
	void atoz()
	{
		
	}
}
public class Demo1{

	
	public static void main(String[] args)
	{
		C c = new C();
		c.abc();
		c.xyz();
		c.atoz();
		
		
	}
}

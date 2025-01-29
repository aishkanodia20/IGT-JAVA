package OOPS;


class Parent2
{
	Parent2()
	{
	System.out.println("Parent class  Constuctor");
}
}

class Child2 extends Parent2
{

	Child2()
	{
		System.out.println("Child class  Constuctor");
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Child2 c2 = new Child2();
	}

}

package P3;

class A
{
	static int x =10000;
	static void display()
	{
		System.out.println("Hiiii");
	}
	
	static void main(String args)
	{
		System.out.println("M1 " +args);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A.display();
		A.main("Aish");
		System.out.println(A.x);
	}

}

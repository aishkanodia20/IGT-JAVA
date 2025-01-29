package OOPS;

class Parent1
{
	int site = 1000;
	
	
	
	
}

class Child1 extends Parent1
{
	int site = 100;
	void display(int site)
	{
		System.out.println("Site :"+site);
		System.out.println("Site :"+this.site);
		System.out.println("Site :"+super.site);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		c1.display(10);
	}

}

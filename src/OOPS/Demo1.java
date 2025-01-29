package OOPS;

class Parent
{
	int site = 5;
	int money = 500000;
	String car = "Benz";
	
	
	
}

class Child extends Parent
{
	int money = 60000;
	void display(int money)
	{
		System.out.println("Site :"+site);
		System.out.println("Money :"+money);
		System.out.println("P Money :"+super.money);
		System.out.println("Car :"+car);
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.display(8888);
	}

}

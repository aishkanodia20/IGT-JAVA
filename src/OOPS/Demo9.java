package OOPS;

class Car
{
	final int speed=200;
	String model = "2020";
	int price = 100000;
	
	final void gare()
	{
		System.out.println("5 gares");
	}
}

class Benz extends Car
{
	void gare()
	{
		System.out.println("non gares");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		System.out.println(c.speed);
		Benz b =  new Benz();
		System.out.println(c.speed);
		
	}

}

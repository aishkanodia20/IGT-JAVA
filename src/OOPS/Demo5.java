package OOPS;
class Emp1
{
	
}
class Clerk1 extends Emp1
{
	Address a = new Address();
}
class Dev1 extends Emp1
{
	Address a = new Address();
	void display()
	{
		System.out.println("Pin: "+a.pin);
	}
	
	
}

class Address
{
	int pin = 9988;
	String street = "5 th main";
};

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dev1 d = new Dev1();
		d.display();
		
		

	}

}

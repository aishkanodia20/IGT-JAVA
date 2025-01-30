package MyBank;


class Sbi extends Bank
{
	void ATM()
	{
		System.out.println("Master Card");
	}
	
	void FD()
	{
		System.out.println("10%");
	}
}

class Axis extends Bank
{
	void ATM()
	{
		System.out.println("Platinum Card");
	}
	
	void FD()
	{
		System.out.println("12%");
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		Sbi s = new Sbi();
		s.ATM();
		Axis a= new Axis();
		a.ATM();
	}
}
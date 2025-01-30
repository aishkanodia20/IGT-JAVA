package Project;

interface Bank
{
	void OT();
	void atm();
	void withdraw();
	default void ZeroAcc()
	{
}
static void xyz()
{
	
}
}

class Sbi implements Bank
{
	public void OT()
	{
		
	}
	
	public void atm()
	{
		
	}
	
	public void withdraw()
	{
		
	}
}

clas Indian implements Bank
{
	public void OT() {
		
	}
	

	public void atm()
	{
		
	}
	
	public void withdraw()
	{
		
	}
}
public class Project3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sbi s = new Sbi();
		s.atm();
		Icici i = new Icici();
		i.atm();
		i.OT();
		i.withdraw();
		i.zeroAcc();
		Bank.xyz();
	}

}

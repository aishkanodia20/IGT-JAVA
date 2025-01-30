package OOPS;

class Em{
	private int id;
	private String name;
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	
	
	
}

public class Demo10{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Em e = new Em();
		e.setId(100);
		System.out.println(e.getId(100));
		System.out.println(e.getName());
	}

}

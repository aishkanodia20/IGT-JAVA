package Exceptions;
import java.util.*;
import java.io.*;

class A
{
	void display()
	{
		String name = "Aish";
		  System.out.println("Name :" + name.length());
		   int arr[] = {5,3,4,6,7,8};
		   String id ="100";
		   int uid = Integer.parseInt(id);
		   System.out.println(uid);
	}
}
class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.display();
	}

}

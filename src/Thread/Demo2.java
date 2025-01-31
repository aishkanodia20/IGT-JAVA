package Thread;
class A extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++){
			try {
				System.out.println(Thread.currentThread().getName()+":"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
 
		A a = new A();	
		
		Thread t1= new Thread(a);
		Thread t2= new Thread(a);
		
		t1.start();t2.start();
		System.out.println(t1);
		System.out.println(t2);
		t1.setName("A");
		t2.setName("B");
		System.out.println(t1);
		System.out.println(t2);
		t1.setPriority(3);
		t2.setPriority(8);
 
		System.out.println(t1);
		System.out.println(t2);
	}
}




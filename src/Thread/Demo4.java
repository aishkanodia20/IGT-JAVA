package Thread;

class Carr extends Thread
{
	public synchronized void run() {			
		for(int i=0;i<=5;i++) {
			try {
				if(Thread.currentThread().getName().equals("Rama")) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
				}
				if(Thread.currentThread().getName().equals("Seetha"))
				{
					System.out.println("	    "+Thread.currentThread().getName()+" : "+i);
				}
				Thread.sleep(1000);					
			} catch (InterruptedException e) {
			}
		}
	}
}
public class Demo4 extends Thread{
	public static void main(String[] args) {
	
		Carr c = new Carr();
		Thread t1= new Thread(c);		// baby born 	
		Thread t2= new Thread(c);
		t1.start();t2.start();			// ready to run
 
		t1.setName("Rama");
		t2.setName("Seetha");
		
	}
}
 
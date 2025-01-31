package Thread;

class Car extends Thread{

	public void run() {

		for(int i=0;i<=20;i++) {

			try {

				if(Thread.currentThread().getName().equals("BMW")) {

					System.out.println(Thread.currentThread().getName() + " " + i);

				}

				else if(Thread.currentThread().getName().equals("BENZ")) {

					System.out.println("      " + Thread.currentThread().getName() + " " + i);

				}

				Thread.sleep(1000);

			}catch(InterruptedException e) {

			}

		}

	}

}
 
public class Demo3 {

	public static void main(String args[]) {

		Car c = new Car();

		Thread t1 = new Thread(c);

		Thread t2 = new Thread(c);

		t1.start();

		t2.start();

		t1.setName("BMW");

		t2.setName("BENZ");

		for(int k=0;k<20;k++) {

			try {

				Thread.sleep(1000);

				System.out.println("              K" + k);

				if(k==10) {

					t1.suspend();

				}

				if(k==15) {

					t1.resume();

				}

				if(k==5) {

					t2.suspend();

				}

				if(k==12) {

					System.out.println("is thred alive? "+ t2.isAlive());

				}

				if(k==14) {

					t2.stop();

				}

				if(k==16) {

					System.out.println("is thred alive? "+ t2.isAlive());

				}

			}catch(Exception e) {

			}

		}

	}
 
}

 
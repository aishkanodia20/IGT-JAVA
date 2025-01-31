package Thread;

class A {
    void display() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("I :" + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B {
    void display() {
        for (int j = 0; j <= 10; j++) {
            try {
                System.out.println("       J :" + j);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C {
    void display() {
        for (int k = 0; k <= 10; k++) {
            try {
                System.out .println("              K :" + k);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo1 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        
        Thread threadA = new Thread(() -> a.display());
        Thread threadB = new Thread(() -> b.display());
        Thread threadC = new Thread(() -> c.display());
        
        threadA.start();
        threadB.start();
        threadC.start();
        
        try {
            threadA.join();
            threadB.join();
            threadC.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
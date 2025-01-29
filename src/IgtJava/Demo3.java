package IgtJava;

class Aba {
    Aba() {
        System.out.println("Hi Constructor A");
    }
    
    void display() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi method");
        }
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Aba ac = new Aba();
        ac.display();
    }
}
package OOPS;

class Bank {
    public void roi() {
        System.out.println("10%");
    }
}

class SBI extends Bank {
}

class Axis extends Bank {
    public void roi() {
        System.out.println("12%");
    }
}

public class Demo7 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.roi();

        Axis a = new Axis();
        a.roi();
    }
}
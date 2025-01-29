package OOPS;

import java.util.Scanner;

class Emp {
    int id;
    String name;
    byte age;

    Emp() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        
        System.out.println("Enter Name: ");
        name = sc.next();
        
        System.out.println("Enter Age: ");
        age = sc.nextByte();
    }
}

class Manager extends Emp {
    int salary = 900000;
    String des = "Manager";

    Manager() {
        super(); // Call to superclass constructor
    }
    
    void display() {
        System.out.println("MY ID is: " + id);
        System.out.println("MY Name is: " + name);
        System.out.println("MY Age is: " + age);
        System.out.println("MY Salary is: " + salary);
        System.out.println("MY Designation is: " + des);
    }
    
    void raiseSalary(int amount) {
        salary += amount;
    }
}

class Tester extends Emp {
    int salary = 300000;
    String des = "Tester";

    Tester() {
        super(); // Call to superclass constructor
    }

    void display() {
        System.out.println("MY ID is: " + id);
        System.out.println("MY Name is: " + name);
        System.out.println("MY Age is: " + age);
        System.out.println("MY Salary is: " + salary);
        System.out.println("MY Designation is: " + des);
    }
    
    void raiseSalary(int amount) {
        salary += amount;
    }
}

class Developer extends Emp {
    int salary = 500000; // Changed to a reasonable salary for a Developer
    String des = "Developer"; // Corrected designation

    Developer() {
        super(); // Call to superclass constructor
    }

    void display() {
        System.out.println("MY ID is: " + id);
        System.out.println("MY Name is: " + name);
        System.out.println("MY Age is: " + age);
        System.out.println("MY Salary is: " + salary);
        System.out.println("MY Designation is: " + des);
    }
    
    void raiseSalary(int amount) {
        salary += amount;
    }
}

class Clerk extends Emp {
    int salary = 200000; // Changed to a reasonable salary for a Clerk
    String des = "Clerk"; // Corrected designation

    Clerk() {
        super(); // Call to superclass constructor
    }

    void display() {
        System.out.println("MY ID is: " + id);
        System.out.println("MY Name is: " + name);
        System.out.println("MY Age is: " + age);
        System.out.println("MY Salary is: " + salary);
        System.out.println("MY Designation is: " + des);
    }
    
    void raiseSalary(int amount) {
        salary += amount;
    }
}

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch1, ch2 = 0;
        Manager m = null;
        Developer d = null;
        Tester t = null;
        Clerk c = null;

        do {
            System.out.println("1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                do {
                    System.out.println("   1) Manager ");
                    System.out.println("   2) Developer ");
                    System.out.println("   3) Tester ");
                    System.out.println("   4) Clerk ");
                    System.out.println("   5) Exit ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1) { m = new Manager(); }
                    if (ch2 == 2) { d = new Developer(); }
                    if (ch2 == 3) { t = new Tester(); }
                    if (ch2 == 4) { c = new Clerk(); }
                } while (ch2 != 5);
            }

            if (ch1 == 2) {
                do {
                    System.out.println("   1) Manager ");
                    System.out.println("   2) Developer ");
                    System.out.println("   3) Tester ");
                    System.out.println("   4) Clerk ");
                    System.out.println("   5) Exit ");
                    ch2 = sc.nextInt();
                    if (ch2 == 1 && m != null) { m.display(); }
                    if (ch2 == 2 && d != null) { d.display(); }
                    if (ch2 == 3 && t != null) { t.display(); }
                    if (ch2 == 4 && c != null) { c.display(); }
                } while (ch2 != 5);
            }

            if (ch1 == 3) {
                System.out.println("   1) Manager ");
                System.out.println("   2) Developer ");
                System.out.println("   3) Tester ");
                System.out.println("   4) Clerk ");
                System.out.println("   5) Exit ");
                ch2 = sc.nextInt();
                int raiseAmount = 0;
                if (ch2 == 1 && m != null) { 
                    System.out.println("Enter raise amount for Manager: ");
                    raiseAmount = sc.nextInt();
                    m.raiseSalary(raiseAmount); 
                }
                if (ch2 == 2 && d != null) { 
                    System.out.println("Enter raise amount for Developer: ");
                    raiseAmount = sc.nextInt();
                    d.raiseSalary(raiseAmount); 
                }
                if (ch2 == 3 && t != null) { 
                    System.out.println("Enter raise amount for Tester: ");
                    raiseAmount = sc.nextInt();
                    t.raiseSalary(raiseAmount); 
                }
                if (ch2 == 4 && c != null) { 
                    System.out.println("Enter raise amount for Clerk: ");
                    raiseAmount = sc.nextInt();
                    c.raiseSalary(raiseAmount); 
                }
            }

            if (ch1 == 4) {
                System.out.println(" Thank You");
            }
        } while (ch1 != 4);
        
        sc.close();
    }
}
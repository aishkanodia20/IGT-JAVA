package IgtJava;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    byte age;
    float sal;
    String des;

    Employee(float salary, String designation) {
        this.sal = salary;
        this.des = designation;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        
        System.out.println("Enter Name: ");
        name = sc.next();
        
        System.out.println("Enter Age: ");
        age = sc.nextByte();
    }

    void display() {
        System.out.println("MY ID is: " + id);
        System.out.println("MY Name is: " + name);
        System.out.println("MY Age is: " + age);
        System.out.println("MY Salary is: " + sal);
        System.out.println("MY Designation is: " + des);
    }

    void raiseSalary(float amount) {
        sal += amount;
    }
}

class Manager extends Employee {
    Manager() {
        super(100000, "Manager");
    }
}

class Tester extends Employee {
    Tester() {
        super(90000, "Tester");
    }
}

class Developer extends Employee {
    Developer() {
        super(80000, "Developer");
    }
}

class Clerk extends Employee {
    Clerk() {
        super(50000, "Clerk");
    }
}

public class Demo2 {
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
                float raiseAmount = 0;
                if (ch2 == 1 && m != null) { 
                    System.out.println("Enter raise amount for Manager: ");
                    raiseAmount = sc.nextFloat();
                    m.raiseSalary(raiseAmount); 
                }
                if (ch2 == 2 && d != null) { 
                    System.out.println("Enter raise amount for Developer: ");
                    raiseAmount = sc.nextFloat();
                    d.raiseSalary(raiseAmount); 
                }
                if (ch2 == 3 && t != null) { 
                    System.out.println("Enter raise amount for Tester: ");
                    raiseAmount = sc.nextFloat();
                    t.raiseSalary(raiseAmount); 
                }
                if (ch2 == 4 && c != null) { 
                    System.out.println("Enter raise amount for Clerk: ");
                    raiseAmount = sc.nextFloat();
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
package Exceptions;
import java.util.*;

class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class A1{
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid Age:");
        
        int age = sc.nextInt(); 
        if (age < 18) {
            throw new InvalidAgeException("Invalid age because it is less than 18: Minimum age required.");
        } else if (age > 60) {
            throw new InvalidAgeException("Invalid age because it is greater than 60: Maximum age allowed.");
        } else {
            System.out.println("Valid age");
        }
        
        sc.close();  
    }
}

public class Demo4 {
    public static void main(String args[]) {
        try {
            A1 a = new A1(); 
            a.display();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

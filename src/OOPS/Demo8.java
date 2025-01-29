package OOPS;

class Animal
{
	public void makeSound()
	{
		System.out.println("Animal makes a sound");
		
	}
	
}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog Barks");
		
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat meows");
		
	}
}
public class Demo8 {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Dog d = new Dog();
		d.makeSound();
		

	}

}

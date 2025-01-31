package Exceptions;
class C{
	C(){
	}
	C(String name){
		System.out.println("Strign");
	}
	void abc() {
		System.out.println("abc method");
	}
}
 
class D extends C{
	D(){
		this(100);
		System.out.println("d class ");
	}
	D(int a){
		super("aish");
	}
	void xyz() {
		System.out.println("xyz method");
	}

}
public class Demo5 {
	public static void main(String args[]) {
		D b = new D();
		b.abc();
	}
 
}
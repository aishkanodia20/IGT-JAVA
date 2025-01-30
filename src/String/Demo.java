package String;
 
public class Demo {
	public static void main(String args[]) {
		String s1 = "Ram";
		String s2 = "Ram";
		String s3  =  new String ("Ram");
		String s4  =  new String ("Ram");
		System.out.println(s1==s2); //true
		System.out.println(s1==s3); //false
		System.out.println(s3==s4); //false
		System.out.println(s3.equals(s4));//true
		String s5  =  new String ("Ram");
		System.out.println(s5.equals(s4)); //false
		System.out.println(s5.equalsIgnoreCase(s4));
		s1.concat("Kumar");
		System.out.println(s1);
		StringBuffer sb = new StringBuffer("Ram");
		sb.append("kumar");
		System.out.println(sb);

	}
}
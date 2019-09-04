package stringexamples;

public class Example2 {
	static int age=27;
	static String s="I am this age: " + age;

	public static void main(String[] args) {
		String string1 = "HELLO";
		String string2 = "hello";
		String name="Hi this is my trial practice for string methods";
	String longstr="this is very big" +" "+"line"+" "+ " "+"So wanna use concat";
	String str="Naveen";
	System.out.print("String after replacing all 'e' with 'i' :" );
	System.out.println(str.replace('e', 'i'));   
	System.out.println(name.indexOf('r'));
	System.out.println(longstr);
	System.out.println(s);
	int var1 = string1.compareToIgnoreCase(string2);
	System.out.println("string1 and string2 comparison: "+var1);
	System.out.println(name.contains("hi"));
	System.out.println(name.contains("Hi")); 
	System.out.println(name.contains("String")); 
	System.out.println(name.contains("string")); 
	System.out.println(name.startsWith("Hi"));

	}

}

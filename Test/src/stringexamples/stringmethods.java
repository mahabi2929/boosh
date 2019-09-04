package stringexamples;

public class stringmethods {
	String concat(String str, String str1)
	{
		String s2 = str.concat(str1);
		return s2;
	}
	

	public static void main(String[] args) {
		String str= new String("my daughter is studying skg in js Global school");
		String name=String.join("^","You","are","Awesome");  
		System.out.println(name);  
	       System.out.println("Substring starting from index 15:");
	       System.out.println(str.substring(15));
	       System.out.println("Substring starting from index 15 and ending at 20:");
	       System.out.println(str.substring(15, 40));
	stringmethods obj=new stringmethods();
	System.out.println(obj.concat("Vishnu", "Priya"));
	}

}


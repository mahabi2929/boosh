package stringexamples;

public class Example1 {
	int a=1001452;
	char c []= {'j','a','v','a'};
	void length()
	{
		System.out.println();
	}
	
	public static void main(String[] args) {
		char c []= {'j','a','v','a'};
		byte ascii[]= {32,67,65,64,85};
		String s="This is test: ";
		String str="Welcome to the java world";
		char ch1=str.charAt(8);
		String s1=new String(c);
		String s2=new String (ascii);
		System.out.print(s1+"  ");
		System.out.println(s1.length());
		System.out.print(s2+"  ");
		System.out.println(s2.length());
		System.out.println("original:" +s);
		String upper=s.toUpperCase();
		String lower=s.toLowerCase();
		System.out.println("Upper: " +upper);
		System.out.println("Lower: " +lower);
		System.out.println("Character @ the index level:"+ch1);
		String cloneStr = new String();
		System.out.println();
	}

}

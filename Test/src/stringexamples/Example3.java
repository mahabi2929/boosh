package stringexamples;

public class Example3 {
	int a,b,c;
	Example3(int a,int b,int c)
	{
		this .a=a;
		this.b=b;
		this.c=c;
		
	}
	public String toString()
	{
		return "dimensions are"+" "+a+b+c;
	}
	String str1 = "String method tutorial";
    String str2 = "compareTo method example";
    String str3 = "String method tutorial";
    {
    int var1 = str1.compareTo( str2 );
    System.out.println("str1 & str2 comparison: "+var1);

    int var2 = str1.compareTo( str3 );
    System.out.println("str1 & str3 comparison: "+var2);

    int var3 = str2.compareTo("compareTo method example");
    System.out.println("str2 & string argument comparison: "+var3);
}
	public static void main(String[] args) {
		String str1 = "    String method tutorial";
	    String str2 = "compareTo method example";
		Example3 e1=new Example3(2,2,2);
		String s="Example3:  "+e1;
		System.out.println(e1);
		System.out.println(s);
		System.out.println(str1.trim());
		System.out.println(str1);

		
		
	
		}

}

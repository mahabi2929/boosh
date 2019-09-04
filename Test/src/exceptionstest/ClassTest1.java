package exceptionstest;

public class ClassTest1 {
	private void m1()
	{
		m2();
		System.out.print("1");
	}
	private void m2()
	{
		m3();
		System.out.print("2");
		}
	private void m3()
	{
		System.out.print("3");
		try
		{
	int sum = 40/0;
	System.out.print("4");
			}
catch(ArithmeticException e)
{
	System.out.print("5");
}
System.out.print("7");
	}
	public static void main(String[] args) {
		ClassTest1 obj=new ClassTest1();
		obj.m1();
	}

}

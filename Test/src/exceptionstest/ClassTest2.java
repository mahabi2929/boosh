package exceptionstest;
public class ClassTest2 
{
	public static void main(String[] args)
	{
	try
	{
		System.out.print("1");
		int data=5/0;
	}
	catch(ArithmeticException e)
	{
		System.out.print("2");
		System.exit(1);
	}
	finally
	{
		System.out.print("3");
	}
	System.out.print("4");
	
	}

	}



package exceptionstest;

public class ClassTest {

	public static void main(String[] args) {
		try {
			System.out.print("1");
			int sum=9/0;
			System.out.print("2");
		}
		catch(ArithmeticException e)
		{
			System.out.print("3");
		}
         catch (Exception e)
		{
        	 System.out.print("4");
		}
		finally
		{
			System.out.print("5");
		}
		}
	}



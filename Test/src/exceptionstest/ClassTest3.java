package exceptionstest;

public class ClassTest3 {
	public static void main(String[] args) {
          try
          {
        	  System.out.print("1");
        	  int data=5/0;
          }
          catch(ArithmeticException e)
          {
        	  Throwable obj=new Throwable("Sample");
        	  try
        	  {
        		  throw obj;
        	  }
        	  catch(Throwable e1)
        	  {
        		  System.out.print(e1);
        	  }
        	  System.out.println(e);
          }
          finally
          {
        	  System.out.print("3");
          }
          System.out.print("4");
        }
}

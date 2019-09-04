package exceptionstest;

public class CustomisedException extends Exception
{
	public CustomisedException(String s) 
    { 
     super(s); 
    } 
	public static class main
	{
		private static int i;
		private static double d;

		public static void main(String args[])
		{
			try
			{
				double[] d = new double[5];
			     d[0] = 1000;
			      d[1] =2000;
			      d[2] =3000;
			      d[3]=4000;
			      d[4]=50;
			      for (int i = 0; i <d.length; i++)
			         System.out.println(d[i]);
 if(d[i]<500)
 {
	 System.out.println(d[i]);
 }
/* else
 {
	 System.out.println(" ");
 }*/
              throw new CustomisedException("Maintain the minimum balance: " );
		
			      }
			
			catch (CustomisedException CE)
			{
				System.out.println("Maintain the minimum balance: ");
			}
			finally
			{
				System.out.println("Thanks for using this bank");
			}
			
		}
	}
}


         	



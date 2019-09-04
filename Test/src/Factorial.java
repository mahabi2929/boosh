import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// factorial of number
		int i,n,f=1;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a number :");
		n=input.nextInt();
		for(i=1;i<=n;i++) {
			 f=f*i;
		}
        System.out.println("factorial of given number : " +f);
	}
}

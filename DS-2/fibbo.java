import java.util.Scanner;

class fibo

{

	public static int fibbo(int n)

	{

		if(n == 0 || n == 1)
                return n;

		return fibbo(n - 1) + fibbo(n - 2);
 
	}

	public static void main(String args[])

	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n");

		int n = sc.nextInt();

		int f = fibbo(n);

		System.out.println(n+"th number in series is "+f);

	}
}
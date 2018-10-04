import java.util.Scanner;

class Power {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

		System.out.println("Enter the x");

		int x = sc.nextInt();

		System.out.println("Enter the y");

		int y = sc.nextInt();
                int result = power(x,y);

        System.out.println(result);
    }

    public static int power(int x, int y) {
        if (y != 0)
            return (x * power(x, y - 1));
        else
            return 1;
    }
}
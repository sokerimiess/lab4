import java.util.Scanner;
public class factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int n = scanner.nextInt();

        scanner.close();

        int result = factorial(n);
        System.out.println(result);
    }
    public static int factorial(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        } else
        {
            return n * factorial(n - 1);
        }
    }
}
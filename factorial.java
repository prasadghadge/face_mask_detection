import java.util.*;
public class factorial {
    public static void main(String args[])
    {   Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int a = findFactorialNumber(number);
        factorialUsingForLoop(number);
        System.out.println("Factorial of "+ number+ " is " + a);
    }

    public static int findFactorialNumber(int num)
    {
        if(num != 0)
        {
            return num * findFactorialNumber(num - 1);
        }
        else
        {
             return 1;
        }
    }

    public static void factorialUsingForLoop(int n)
    {
        int r = 1;
        for(int i =n; i>=1; i--)
        {
            r = r * i;
        }

        System.out.println("Factorial using for Loop is "+ r);
    }
}

import java.util.*;
public class program1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int iNo = sc.nextInt();
        printpyramid(iNo);
    }

    public static void printpyramid(int iNo)
    {
        int sum = 0;
        int i = 1;
        while(sum<iNo)
        {
            sum += i;
            i++;
        }

        if(sum == iNo)
        {
            System.out.println("Blocks used:"+sum);
            System.out.println("Stages:"+ (i-1));
        }

        else{
            int sum1 = sum - i + 1;
            System.out.println("Blocks used:"+sum1);
            System.out.println("Remaining blocks"+ (iNo - sum1));
            System.out.println("Stages:"+ (i-2));

        }


    }
}
import java.util.*;
public class sumtoprime
{
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        for(int i = 2; i<num/2; i++)
        {
            if(num%i==0)
            {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalsum = 0;
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            totalsum+=arr[i];
        }
        boolean found = false;
        for(int i = 0; i<n;i++)
        {
            int remainingsum = totalsum-arr[i];
            if(isPrime(remainingsum)==true)
            {
                found = true;
                System.out.print(remainingsum);
                break;
            }

        }
        if(found == false)
        {
            System.out.print("No prime sum found");
        }



    }
}

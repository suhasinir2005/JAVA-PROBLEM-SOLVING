import java.util.*;
public class arm 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int sum = 0;
        while(n>0)
        {
            int a = n%10;
            int a1 = a*a*a;
            sum+=a1;
            n=n/10;
        
        }
            if(sum==x)
            {
                System.out.print(x+" is a armstrong number!");
            }
            else
            {
            System.out.print(x+" is not a armstrong number!");
            }
    }
}

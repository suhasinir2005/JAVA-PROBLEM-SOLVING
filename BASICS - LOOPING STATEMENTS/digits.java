import java.util.*;
public class digits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int sum =0;
        while(n>=10)
        {
            while(n>0)
            {
                int a =n%10;
                sum+=a;
                n=n/10;
            }
            n=sum;
        }
        System.out.print(n);
    }
}

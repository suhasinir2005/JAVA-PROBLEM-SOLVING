import java.util.*;
public class evenoddfunction 
{
    void oddeven(int num)
    {
        if(num%2==0)
        {
            System.out.print("Even");
        }
        else
        {
            System.out.print("odd");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenoddfunction obj1 = new evenoddfunction();
        obj1.oddeven(n);
    }
}


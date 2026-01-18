import java.util.*;
public class sumright 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            int rightsum = 0;
            for(int j = i+1;j<n;j++)
            {
                rightsum+=arr[j];
            }
            if(arr[i]>rightsum)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}

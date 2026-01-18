import java.util.*;
public class cleanedlist {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int d = arr[0];
        System.out.print(arr[0]+" ");
        int count = 1;
        for(int i = 1;i<n;i++)
        {
            if(arr[i]!=d)
            {
                System.out.print(arr[i]+" ");
                count+=1;
                d=arr[i];
            }
        }
        System.out.println();
        System.out.print(count);
    }

}

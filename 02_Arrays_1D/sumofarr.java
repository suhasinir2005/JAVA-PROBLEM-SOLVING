import java.util.*;
public class sumofarr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        for(int i : arr)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
}

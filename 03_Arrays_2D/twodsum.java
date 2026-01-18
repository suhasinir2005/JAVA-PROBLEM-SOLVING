import java.util.*;
public class twodsum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] arr = new int[m][m];
        for(int i = 0 ; i<m ;i++)
        {
            for(int j = 0; j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0 ; i<m ;i++)
        {
            for(int j = 0; j<m;j++)
            {
                if(i==j)
                {
                    sum1 += arr[i][j];
                }
                if(i+j==m-1)
                {
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of the main diagnol: "+sum1);
        System.out.println("Sum of the secondary diagnol: "+sum2);
        

    }
}

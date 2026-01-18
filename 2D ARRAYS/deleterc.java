import java.util.*;
public class deleterc {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0 ; i<m ;i++)
        {
            for(int j = 0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int idx1 = 0;
        int idx2 = 0;
        for(int i = 0; i<m;i++)
        {
            for(int j =0; j<n;j++)
            {
                if(arr[i][j]==k)
                {
                    idx1 = i;
                    idx2 = j;
                }
            }
        }
        for(int i = 0 ; i<m ;i++)
        {
            if(i==idx1) continue;
            for(int j = 0; j<n;j++)
            {
                if(j==idx2) continue;
                else
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
}

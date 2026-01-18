import java.util.*;
public class twodarr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m; i++)
        {
            for(int j = 0; j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        if(m>1 && n>1)
        {
            System.out.println("Top left: "+arr[0][0]);
            System.out.println("Top right: "+arr[0][n-1]);
            System.out.println("Bottom left: "+arr[m-1][0]);
            System.out.println("Bottom right: "+arr[m-1][n-1]);
        }
        else
        {
            System.out.print("No corners found");
        }
    }
    
}

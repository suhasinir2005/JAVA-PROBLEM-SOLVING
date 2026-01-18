import java.util.*;
public class mergetransform 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        for(int i = 0; i<r1 ; i++)
        {
            for(int j = 0; j<c1; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Transform array 1
        int[][] trans_arr = new int[r1][c1];
        for(int i = 0; i<r1 ; i++)
        {
            int sum = 0;
            for(int j = 0; j<c1; j++)
            {
                sum += arr1[i][j];
            }
            for(int j = 0; j<c1;j++)
            {
                trans_arr[i][j] = sum;
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        for(int i = 0; i<r2 ; i++)
        {
            for(int j = 0; j<c2; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        System.out.println("Transformed Matrix: ");
        for(int i = 0; i<r1 ; i++)
        {
            for(int j = 0; j<c1; j++)
            {
                System.out.print(trans_arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Final merged Matrix: ");
        if (k == 0)
        {
        for(int i = 0; i<r1 ; i++)
        {
            for(int j = 0; j<c1; j++)
            {
                System.out.print(trans_arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0; i<r2 ; i++)
        {
            for(int j = 0; j<c2; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        }
        else
        {
        for(int i = 0; i<r1 ; i++)
        {
            for(int j = 0; j<c1 ; j++)
            {
                System.out.print(trans_arr[i][j]+" ");

            }
            for(int j = 0;j<c2 ; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        } 
    }
}

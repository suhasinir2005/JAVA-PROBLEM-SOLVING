import java.util.*;
public class firsthighestelement 
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int max_index = 0;
            for(int i=0;i<n;i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                    max_index=i;
                }
            }
            
            System.out.print("First Highest Element: "+max+" at index "+max_index);
        }
}

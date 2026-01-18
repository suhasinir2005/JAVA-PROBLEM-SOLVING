import java.util.*;
public class arrinput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("middle number: "+arr[a/2]);
    }
}

import java.util.*;
public class sumeve {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        while(n>0){
            int digit = n%10;
            sum+=digit;
            n=n/10;
        }
        if(sum%2==0){
           System.out.print("even");
        }
        else
        {
            System.out.print("odd");
        }
    }
}

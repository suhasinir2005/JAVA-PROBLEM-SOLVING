import java.util.*;
public class asc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = true;
        while(n>0)
        {
            int a = n%10;
            n=n/10;
            int b = n%10;
            n=n/10;
            if(a<b)
            {
                check = false;
                System.out.print("No");
                break;
            }

        }
        if(check){
            System.out.print("Yes");
        }
    }
    
}

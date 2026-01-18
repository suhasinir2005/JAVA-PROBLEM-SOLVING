import java.util.*;
public class countdigits {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int count =0;
    if(a==0){
        System.out.print(1);
        return;
    }
    while(a>0){
        int digit = a%10;
        count+=1;
        a=a/10;
    }
    System.out.print(count);
   } 
}

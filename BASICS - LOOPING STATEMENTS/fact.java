import java.util.*;
public class fact {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int p = 1;
    for(int i = 1;i<=n;i++)
    {
        p = p*i;
    }
    System.out.print(p);
  }  
}

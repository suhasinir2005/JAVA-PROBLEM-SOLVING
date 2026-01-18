import java.util.*;
public class whiledo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do{
            System.out.print("Enter a number that is greater than 10: ");
            a = sc.nextInt();
        }
        while(a<10);

    }
}

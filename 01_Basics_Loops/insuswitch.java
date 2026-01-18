import java.util.*;
public class insuswitch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String status = sc.next();
        if(age>18 && age<=30)
        {
            switch(status)
            {
                case "excellent": System.out.print("500");
                break;
                case "good": System.out.print("700");                 
                break;
                default: System.out.print("900");
                break;

            }
        }
        else if(age>30 && age<=50)
        {
            switch(status)
            {
                case "excellent": System.out.print("700");
                break;
                case "good": System.out.print("900");                 
                break;
                default: System.out.print("1100");
                break;

            }
        }
        
    }
}

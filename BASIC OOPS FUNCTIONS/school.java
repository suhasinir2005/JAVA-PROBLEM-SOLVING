import java.util.*;
public class school {
    String passfail(int num)
    {
        if(num>=35)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int totalmark = sc.nextInt();
        school obj1 = new school();
        String result = obj1.passfail(totalmark);
        System.out.print(result);
    }
}

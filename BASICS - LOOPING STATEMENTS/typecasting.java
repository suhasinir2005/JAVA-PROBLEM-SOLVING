import java.util.Scanner;
public class typecasting{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        int b = (int)a;
        System.out.print("The converted integer is "+b);
    }
}
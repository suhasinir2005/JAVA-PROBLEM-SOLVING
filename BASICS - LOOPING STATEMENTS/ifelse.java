import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=35){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}

import java.util.*;
public class atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = sc.nextInt();
        if(((amount%100)==0) && (amount<=balance)&&((balance-amount)>=500))
        {
            System.out.println("Transaction successfull");
            System.out.print("Balance after transaction:"+(balance-amount));
        }
        else
        {
            System.out.print("Transaction failed");
        }
    }

}

    


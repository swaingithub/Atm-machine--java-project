import java.util.*;

public class Atm {
public static void main(String[] args) throws Throwable {
    System.out.println("Start");
    int pin = 3616;
    int Balance = 50000;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your pin");
    int UserPin = sc.nextInt();
    if (UserPin==pin) {
        System.out.println("Enter Amount to withdraw");
        int amount = sc.nextInt();
        if (amount<=Balance) {
            System.out.println("Removed card");
            System.out.println("wait for cash");
        }
        else
        {
            throw new Throwable("BalanceException");
        }
    }
    else
    {
        throw new Throwable("PinException");
    }
    System.out.println("End");
}
    
}
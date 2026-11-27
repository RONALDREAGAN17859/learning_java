import java.util.Scanner;
public class ATM{
    public static void main (String[]args){
        Scanner look = new Scanner (System.in);

        double balance =2500.00;
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        int choice = look.nextInt();

        switch (choice){
            case 1:
                System.out.println("Your balance is: $" + balance);
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = look.nextDouble();
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    System.out.println("Please take your cash.");
                } else {
                    System.out.println("Insufficient funds.");
                }
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = look.nextDouble();
                balance += depositAmount;
                System.out.println("Deposit successful.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
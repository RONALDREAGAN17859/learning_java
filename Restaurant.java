import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner look = new Scanner(System.in);
        System.out.println("Welcome to the Restaurant!");
        System.out.println("1. View Menu");
        System.out.println("2. Place Order");
        int choice = look.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Menu: \n 1. Chapatti (10) \n 2. Rice (20) \n 3. Ugali (30) \n 4. Mandazi (5)");
                System.out.println("==============STEW==================");
                System.out.println("1. Beef_Stew (100) \n 2. Chicken_Stew (80) \n 3. Fish_Stew (90)");
                break;

            case 2:
                System.out.println("Enter your food order: ");
                String food = look.next();
                System.out.println("Enter your stew order: ");
                String stew = look.next();

                int chapatti = 10;
                int rice = 20;
                int ugali = 30;
                int mandazi = 5;
                int beef_stew = 100;
                int chicken_stew = 80;
                int fish_stew = 90;
                int total_bill = 0;

                // Match food using switch
                switch (food.toLowerCase()) {
                    case "chapatti":
                        total_bill += chapatti;
                        break;
                    case "rice":
                        total_bill += rice;
                        break;
                    case "ugali":
                        total_bill += ugali;
                        break;
                    case "mandazi":
                        total_bill += mandazi;
                        break;
                    default:
                        System.out.println("Unknown food item.");
                }

                // Match stew using switch
                switch (stew.toLowerCase()) {
                    case "beef_stew":
                        total_bill += beef_stew;
                        break;
                    case "chicken_stew":
                        total_bill += chicken_stew;
                        break;
                    case "fish_stew":
                        total_bill += fish_stew;
                        break;
                    default:
                        System.out.println("Unknown stew item.");
                }

                System.out.println("Your order is: " + food + " with " + stew);
                System.out.println("Total bill: " + total_bill);
                break;

            default:
                System.out.println("Invalid choice.");
        }
        look.close();
    }
}

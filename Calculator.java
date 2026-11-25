import java.util.Scanner;
public class Calculator{
    public static void main (String[]args){
        Scanner look = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = look.nextInt();

        System.out.println("choose an operator:+,-,*,/");
        char op= look.next().charAt(0);

        System.out.println("Enter second number:");
        int num2 =look.nextInt();

        double results;

        switch (op) {

            case '+':
            results = num1 + num2;
            System.out.println("answer is:" +results);
            break;

            case '-':
                results = num1-num2;
                System.out.println("answer is: "+results);
                break;

                case '*': 
                    results = num1 * num2;
                    System.out.println("Answer is: "+results);
                    break;
                    case '/': 
                        if (num2 !=0){
                            results=num1/num2;
                        System.out.println("Answer is: "+results);
                        }else{
                            System.out.println("division by 0 is a math error");                            
                        } 
                        default :
                        System.out.println("invalid operator");
        }
        System.out.println("Nice doing maths with you!");
        look.close();
    }
}
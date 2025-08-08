package Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter choice +, -, *, /: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.printf("%d + %d = %d",number1,number2, number1+number2);
                break;
            case '-':
                System.out.printf("%d - %d = %d",number1, number2, number1-number2);
                break;
            case '*':
                System.out.printf("%d * %d = %d",number1, number2, number1*number2);
                break;
            case '/':
                try {
                    System.out.printf("%d / %d = %d",number1, number2, number1/number2);
                    break;
                }catch (Exception e){
                    System.out.println("you can't divide to zero");
                }
            default:
                System.out.println("this is no such meaning");
                break;
        }
    }
}

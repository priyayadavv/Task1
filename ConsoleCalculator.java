import java.util.Scanner;

public class ConsoleCalculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
        
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            double result = 0;
            boolean validOperation = true;

        
            switch (op) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            // Continue option
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator closed.");
        sc.close();
    }
}

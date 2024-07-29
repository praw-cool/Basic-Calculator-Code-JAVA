import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the First Number :");
            int a = sc.nextInt();

            System.out.println("Enter the Second Number :");
            int b = sc.nextInt();

            System.out.println("Choose an Operation :");
            System.out.println("1 : Addition (a + b)");
            System.out.println("2 : Subtraction (a - b)");
            System.out.println("3 : Multiplication (a * b)");
            System.out.println("4 : Division (a / b)");

            System.out.println("Enter your choice (1-4) :"); // Users Choice as they want to perform their choice of Operations
            int yourChoices = sc.nextInt();

            switch (yourChoices) {
                case 1:
                    System.out.println("Result :" + (a + b));
                    break;
                case 2:
                    System.out.println("Result :" + (a - b));
                    break;
                case 3:
                    System.out.println("Result :" + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Invalid Operation: Division by zero.");
                    } else {
                        System.out.println("Result :" + (a / b));
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Do you want to perform another operation? (yes/no):");
            sc.nextLine(); // Consume the newline character
            String continueChoice = sc.nextLine();

            if (!continueChoice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the program...");
                break;
            }
        }

        sc.close();
    }
}

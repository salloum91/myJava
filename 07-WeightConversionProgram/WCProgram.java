import java.util.Scanner;

public class WCProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Weight Conversion Program ----");
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        int choice = 0;
        boolean validChoice = false;

        // Keep asking until user enters 1 or 2
        while (!validChoice) {
            System.out.println("Choose conversion type:");
            System.out.println("1 - Convert from Kg to Lbs");
            System.out.println("2 - Convert from Lbs to Kg");
            System.out.print("Enter your choice (1 or 2): ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();

                if (choice == 1 || choice == 2) {
                    validChoice = true;
                } else {
                    System.out.println("Invalid choice! Please enter 1 or 2.");
                }
            } else {
                System.out.println("Invalid input! Please enter a number (1 or 2).");
                scanner.next(); // clear the invalid input
            }
        }

        // Perform conversion
        if (choice == 1) {
            double weightInLbs = weight * 2.205;
            System.out.printf("Your weight is: %.2f Lbs%n", weightInLbs);
        } else {
            double weightInKg = weight * 0.45359237;
            System.out.printf("Your weight is: %.2f Kg%n", weightInKg);
        }

        scanner.close();
    }
}

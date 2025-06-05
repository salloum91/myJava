import java.util.Scanner;

import java.util.Scanner;

public class SentinelValue2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char sentinel = 'c';

        System.out.println("Enter an Answer: a or b or c ");
        while (true) {
            String result = scanner.nextLine();

            // Ensure input is not empty and get the first character
            if (result.length() > 0 && result.charAt(0) == sentinel) {
                System.out.println("Right answer!!");
                break; // stop loop if correct
            } else {
                System.out.println("Wrong answer, choose another answer:");
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class SentinelValueJava {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sentinel = 0;
        int input;

        System.out.println("Enter numbers to double them. Enter 0 to stop:");

        while (true) {
            input = scanner.nextInt();

            if (input == sentinel) {
                System.out.println("Sentinel value entered. Exiting...");
                break;
            }

            int result = input * 2;
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}

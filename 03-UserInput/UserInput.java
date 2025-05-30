import java.util.Scanner;


public class UserInput {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        // Login demonstration
        System.out.println("enter your First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("enter your Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("enter your E-mail: ");
        String eMail = scanner.nextLine();
        System.out.println("enter your age: ");
        String age = scanner.nextLine();

        System.out.println("your Login Data:");
        System.out.println("Full Name: "+ firstName +" "+ lastName );
        System.out.println("E-mail: "+ eMail);
        System.out.println("Age: "+ age);

        scanner.close();



    }

}

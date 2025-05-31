import java.util.Scanner;

public class EnhancedSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" --- Days Info ---");
        System.out.print("Geben Sie einen Tag ein: ");
        String day = scanner.nextLine().toLowerCase();

        String results = switch (day) {
            case "montag", "dienstag", "mittwoch", "donnerstag", "freitag" -> "Er ist ein Werktag!";
            case "samstag", "sonntag" -> "Er ist ein Wochenendtag!";
            default -> "Ungültiger Wert!";
        };

        System.out.println(results);

        scanner.close();
    }
}

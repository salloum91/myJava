public class TernaryOperator {

    public static void main(String[] args) {

        int note = 49;
        String status = "Nicht Heirated";
        boolean klasse1 = true;
        boolean andereKlasse = false;

        String isBestanden = (note == 50) ? "bestanden" : "nicht bestanden";

        boolean steuerKlasse = status.equals("Nicht Heirated") ? klasse1 : andereKlasse;
        String NameOfKlase = (steuerKlasse) ? "Klasse 1" : "andere Klasse";
        System.out.println("Result: " + isBestanden);
        System.out.println("Deine Steuerklasse ist: " + steuerKlasse);
        System.out.println(NameOfKlase);

    }
}
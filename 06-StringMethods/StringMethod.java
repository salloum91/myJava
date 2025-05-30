import java.util.Locale;

public class StringMethod {

    public static void main ( String[] args){

        String s = "Hello World";


        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(1,6)); // from index 0 to 4
        System.out.println(s.replace("Hello","java"));
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("rld"));
        System.out.println(s.split("")[0]);
        System.out.println(s.strip());




    }


}

public class FormattingPrintf {

    public static void main (String[] args ){
        String name = "Pizza";
        int age = 34;
        double height = 60.3;
        boolean isEmployed = true;


        System.out.printf("i love %S.\n",name);
        System.out.printf("your age is %d\n",age);
        System.out.printf("your height is %.1f\n",height); //1digit after comma
        System.out.printf("your height is %f\n",height);
        System.out.printf("you have a job , %b",isEmployed);
    }

}
